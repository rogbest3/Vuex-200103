package com.moneyhub.web.cus;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.moneyhub.web.util.Printer;

@Service
public class CustomerService {
	@Autowired private CustomerRepository customerRepository;
	@Autowired private Printer printer;
	// 자바의 정석 847 collect()
	public List<String> namesOfStudents() {
		// 1. 학생의 이름
		return customerRepository.findByRole("student").stream()
				.map(Customer::getCname)
				.collect(Collectors.toList());
	}
	public Customer[] streamToArray() {
		// 2. 스트림을 배열로 전환
		return customerRepository.findByRole("student").stream()
				.toArray(Customer[]::new);
	}
	public Map<String, Customer> streamToMap() {
		// 3. 스트림을 맵으로 전환. 학생이름이 key
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.toMap(s->s.getCname(), p->p));
	}
	public Long theNumberOfStudents() {
		// 4. 학생의 수
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.counting());
	}
	public Integer totalScore() {
		// 5. 학생들 총점
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.summingInt(Customer::getScore));
	}
	public Optional<Customer> topStudent(){
		// 6. 1등 학생
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(Customer::getScore)));
	}
	public IntSummaryStatistics getStat() {
		// 7. 전체 학생 성적 통계
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.summarizingInt(Customer::getScore));
	}
	public String nameList() {
		// 8. 전체 학생 이름
		return customerRepository.findByRole("student").stream()
				.map(Customer::getCname)
				.collect(Collectors.joining(",","{","}"));
	}
	
	
	// 자바의정석 851 partioningBy()
	public List<Customer> partioningByGender(boolean gender) {
		// 1.단순분할 (성별로 분할) 남성 true 여성 false
		return customerRepository.findByRole("student").stream()
				.collect(
						Collectors
							.partitioningBy(Customer::isMale))
				.get(gender);
	}
	public Long partioningCountPerGender(boolean gender) {
		// 2.단순분할 (성별 학생수)
		return customerRepository.findByRole("student").stream()
				.collect(
						Collectors
							.partitioningBy(Customer::isMale,
								Collectors.counting()))
				.get(gender);
	}
	public Customer partioningTopPerGender(boolean gender) {
		// 3.단순분할 (성별 1등) 남성 true 여성 false
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.partitioningBy(
						Customer::isMale,
						Collectors.collectingAndThen(
								Collectors.maxBy(
										Comparator.comparingInt(
												Customer::getScore)),
												Optional::get)))
				.get(gender);
	}
	public List<Customer> partioningRejectPerGender(boolean gender) {
		// 4.다중분할 (성별 불합격자, 50점이하) 남성 true 여성 false
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.partitioningBy(Customer::isMale,
						Collectors.partitioningBy(s->s.getScore()<=50)))
				.get(gender)
				.get(true);
	}
	// 자바의정석 855 
	public Map<Integer, List<Customer>> findByHak() {
		//1. 단순 그룹화(반별로 그룹화)
		 return customerRepository
				.findByRole("student").stream()
				.collect(Collectors.groupingBy(Customer::getBan));
	}
	public Map<Customer.Level, List<Customer>> groupByGrade() {
		//2. 단순그룹화(성적별로 그룹화)
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.groupingBy(
						s->{
							if(s.getScore()>= 80) return Customer.Level.HIGH;
							else if(s.getScore()>=50)return Customer.Level.MID;
							else return Customer.Level.LOW;}
						));
		
	}
	public Map<Customer.Level, Long> personCountByLevel() {
		//3. 단순그룹화 + 통계(성적별 학생수))
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.groupingBy(s->{
					if(s.getScore()>= 80) return Customer.Level.HIGH;
					else if(s.getScore()>=50)return Customer.Level.MID;
					else 					return Customer.Level.LOW;}, 
						Collectors.counting()
				));
				
				
	}
	public Map<Integer, Map<Integer, List<Customer>>> multiGrouping() {
		// 4. 다중 그룹화 (학년별, 반별)
		return customerRepository.findByRole("student").stream()
				.collect(
					Collectors.groupingBy(Customer::getHak, 
							Collectors.groupingBy(Customer::getBan)
				));
	}
	public Map<Integer, Map<Integer, Object>> multiGroupingMax() {
		// 5. 다중 그룹화 +통계 (학년별, 반별 1등)
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.groupingBy(Customer::getHak,
						Collectors.groupingBy(Customer::getBan,
								Collectors.collectingAndThen(
								Collectors.maxBy(Comparator
										.comparingInt(Customer::getScore)),
								Optional::get))));
	}
	public Map<Object, Set<Object>> multiGroupingGrade() {
		// 6. 다중그룹화 + 통계(학년별, 반별 성적그룹)
		return customerRepository.findByRole("student").stream()
				.collect(Collectors.groupingBy(s-> s.getHak()+"-"+ s.getBan(),
						Collectors.mapping(s->{
							if(s.getScore()>= 80) return Customer.Level.HIGH;
							else if(s.getScore()>=50)return Customer.Level.MID;
							else 					return Customer.Level.LOW;},
							Collectors.toSet())));
						
	}
//		
//	// 자바의 정석 p847 collect()
//	// 1. 학생 수
//	public List<String> theNumberOfStudents() {
//		return customerRepository.findByRole("student").stream()
//				.map(Customer :: getCname)
//				.collect(Collectors.toList());
//	}
//	// 2. 스트림을 배열로 전롼
//	public Customer[] streamArray() {
//		return customerRepository.findByRole("student").stream()
//				.toArray(Customer[] :: new);
//	}
//	
//	// 3. 스트림을 Map로 전롼
//	public Map<String, Customer> streamMap() {
//		return customerRepository.findByRole("student").stream()
//				.collect(Collectors.toMap( s -> s.getCname(), p -> p));
//	}	
//	
//	// 4. 학생 수
//	public Long studentCount() {
//		return customerRepository.findByRole("student").stream()
//				.collect(Collectors.counting());
//	}	
//			
//	// 5. 총점
//	public Long totalScore() {
//		return customerRepository.findByRole("student").stream()
//				.collect(Collectors.summingInt(Customer :: getScore));
//	}
//	
//	
//	
//	
//	// 1. 단순 그룹화( 반별로 그룹화 )
//	public void findByHak() {
//		Map<Integer, List<Customer>> map = customerRepository
//				.findGroupByHak()
//				.stream()
//				.collect(Collectors.groupingBy(Customer :: getBan));
//		for(List<Customer> ban : map.values()) {
//			for(Customer c : ban ) {
//				printer.accept(c.toString());
//			}
//		}
//	}
//	
//	// 2. 단순 그룹화( 성적별 그룹화 )
//	public void findByGrade() {
//		Map<Customer.Level, List<Customer>> map = customerRepository
//				.findGroupByHak()
//				.stream()
//				.collect(Collectors.groupingBy( 
//						s -> { if( s.getScore() >= 80 ) return Customer.Level.HIGH;
//						else if(s.getScore() >= 50 ) return Customer.Level.MID;
//						else return Customer.Level.LOW; } ));
//		
//
///*		print용 코드
// * 		TreeSet<Person.Level> keySet = new TreeSet<>(map.keySet());
//		for(Person.Level key: keySet) {
//			printer.accept("["+key+"]");
//			for(Person p : map.get(key)) {
//				printer.accept(p.toString());
//			}
//			System.out.println();
//		}*/
//	}
//	// 3. 단순 그룹화( 통계 - 성적별 학생수 )
//	public void customerCountByLevel() {
//		Map<Customer.Level, Long> map = 
//				customerRepository.findGroupByHak().stream()
//				.collect(Collectors.groupingBy( s -> {
//					if( s.getScore() >= 80 ) return Customer.Level.HIGH;
//					else if(s.getScore() >= 50 ) return Customer.Level.MID;
//					else return Customer.Level.LOW;}, Collectors.counting()
//				));
//	}
//	
//	// 4. 다중 그룹화( 학년별, 반별 )
//	public Object multiGrouping() {
//		return
//				customerRepository.findGroupByHak().stream()
//				.collect(Collectors.groupingBy( Customer :: getHak,
//						Collectors.groupingBy( Customer :: getBan )
//				));
//	}
////	public void multiGrouping() {
////		Map<Customer.Level, Long> map = 
////				customerRepository.findGroupByHak().stream()
////				.collect(Collectors.groupingBy( Customer :: getHak,
////						Collectors.groupingBy( Customer :: getBan )
////				));
////	}
//	
//	// 5. 다중 그룹화 + 통계( 학년별, 반별 )
//	public Object multiGroupingMax() {
//		return
//				customerRepository.findGroupByHak().stream()
//				.collect(Collectors.groupingBy( Customer :: getHak,
//						Collectors.groupingBy( Customer :: getBan,
//								Collectors.collectingAndThen(
//										Collectors.maxBy(Comparator
//												.comparingInt(Customer::getScore)),
//										Optional :: get)
//				)));
//	}
//	
//	// 6. 다중 그룹화 + 통계( 학년별, 반별 성적 그룹 )
//	public Object multiGroupingGrade() {
//		return
//				customerRepository.findGroupByHak().stream()
//				.collect(Collectors.groupingBy( // collect 리턴하며 map
//						s -> s.getHak() + "-" + s.getBan(),
//						Collectors.mapping(s -> {
//							if( s.getScore() >= 80 ) return Customer.Level.HIGH;
//							else if(s.getScore() >= 50 ) return Customer.Level.MID;
//							else return Customer.Level.LOW;}, Collectors.toSet())
//						));	
//	}
//	
//	// partitioningBy()
//	// 1. 단순 분할( 성별로 분할 )
//	public Object partitioningByGender() {
//		Map<Boolean, List<Customer>> map = 
//				customerRepository.findGroupByHak().stream()
//				.collect(Collectors.partitioningBy(Customer :: isMail));
//		List<Customer> maleCustomer = map.get(true);
//		List<Customer> femaleCustomer = map.get(false);
//		return maleCustomer;
//	}
//	
	
	
	
	
}

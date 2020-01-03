package com.moneyhub.web.cus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyhub.web.pxy.Box;
import com.moneyhub.web.pxy.Proxy;
import com.moneyhub.web.util.Printer;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CustomerController {

	@Autowired private CustomerRepository customerRepository;
	@Autowired private Customer customer;
	@Autowired private Printer printer;
	@Autowired private Proxy proxy;
	@Autowired private Box<Object> box;
	@Autowired ModelMapper modelMapper;
	@Autowired private CustomerService customerService;
	
	@Bean public ModelMapper modelMapper() { return new ModelMapper(); }
	
	@RequestMapping("/join")
	public void join (@RequestBody Customer param){
		printer.accept("join 진입");

		printer.accept(param.toString());
		
		customerRepository.save(param);
	}
	
	@RequestMapping("/login")
	public HashMap<String, Object> login(@RequestBody Customer param) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		printer.accept("로그인 진입");
		printer.accept(String.format("Cemail : %s", param.getCemail()));
		printer.accept(String.format("Cpwd : %s", param.getCpwd()));
		customer = customerRepository.
				findByCemailAndCpwd(param.getCemail(), param.getCpwd());
		if(customer != null) {
			printer.accept("로그인 성공");
			map.put("result", "SUCCESS");
			map.put("customer", customer);
			printer.accept(map.get("result"));
		}else {
			printer.accept("로그인 실패");
			map.put("result", "FAIL");
			map.put("customer", customer);
		}
		return map;
	}
	
	@DeleteMapping("/withdrawal/{cemail}")	// 회원탈퇴
	public void withdrawal(@PathVariable String cemail) {
		printer.accept("회원탈퇴 진입");
		/*
		 * customer = customerRepository.findByCemail(cemail);
		 * customerRepository.delete(customer);
		 */
		customerRepository
		.delete(customerRepository
				.findByCemail(cemail));
	}
	
	@PutMapping("/update")
	public HashMap<String, Object> update(@RequestBody Customer param) {
		printer.accept("수정 진입");
		printer.accept(param.toString());
		
		HashMap<String, Object> map = new HashMap<>();
		
		customerRepository.save(param);
		customer = customerRepository.findByCemail(param.getCemail());
		map.put("result", "SUCCESS");
		map.put("customer", customer);
		
		return map;
	}
	
	@GetMapping("/students")
	public List<Customer> studentsList(){
		printer.accept("리스트 진입");
//		Iterable<Person> entites = personRepository.findByRole("student");
		Iterable<Customer> entities = customerRepository.findAll();
		List<Customer> list = new ArrayList<>();
		
		for(Customer p : entities) {
			Customer dto = modelMapper.map(p, Customer.class);
			if(dto.getRole().equals("student"))
				list.add(dto);
		}
		list.stream().filter(role-> role.getRole().equals("student"));		
		return list.stream()
				.sorted(Comparator.comparing(Customer::getCustomerid)
							.reversed()).collect(Collectors.toList());
	}
	
	@GetMapping("/students/{searchword}")
	public HashMap<?, ?> findSome(@PathVariable String searchword){
		printer.accept("검색 진입");
		customerService.findByHak();
		switch (searchword) {
		case "namesOfStudents" : 
			box.put("list", customerService.namesOfStudents());
			printer.accept(box.get().toString());
			break;
		case "streamToArray" :
			box.put("list", customerService.streamToArray());
			printer.accept(box.get().toString());
			break;
		case "streamToMap" : break;
		case "theNumberOfStudents" : break;
		case "totalScore" : break;
		case "topStudent" : break;
		case "getStat" : break;
		case "nameList" : break;
		case "partioningByGender" : break;
		case "partioningCountPerGender" : break;
		case "partioningTopPerGender" : break;
		case "partioningRejectPerGender" : break;
		case "findByHak" : break;
		case "groupByGrade" : break;
		case "personCountByLevel" : break;
		case "multiGrouping" : break;
		case "multiGroupingMax" : break;
		case "multiGroupingGrade" : break;

		default:
			break;
		}
//		Iterable<Person> entites = personRepository.findByRole("student");
//		Iterable<Customer> entities = customerRepository.findGroupByHak();
//		List<Customer> list = new ArrayList<>();
//		for(Customer p : entities) {
//			Customer dto = modelMapper.map(p, Customer.class);
//			list.add(dto);
//		}
//		return list.stream().filter(l-> l.getHak() == proxy.parseInt(searchword) );
		return box.get();
	}

	@GetMapping("/students/search/{searchword}")
	public HashMap<?, ?> findSome1(@PathVariable String searchword){
		printer.accept("검색1 진입");
		String switchKey = "";
		
		switch (searchword) {
			case "namesOfStudents" : 
				break;
			case "streamToArray" :
				break;
			case "streamToMap" : break;
			case "theNumberOfStudents" : break;
			case "totalScore" : break;
			case "topStudent" : break;
			case "getStat" : break;
			case "nameList" : break;
			case "남학생목록" : case "여학생목록" : 
				switchKey = (searchword == "남") 
							? "partioningByMale" 
							: "partioningByFemale";
				break;
			case "partioningCountPerGender" : break;
			case "partioningTopPerGender" : break;
			case "partioningRejectPerGender" : break;
			case "findByHak" : break;
			case "groupByHak" : break;
			case "groupByGrade" : break;
			case "personCountByLevel" : break;
			case "multiGrouping" : break;
			case "multiGroupingMax" : break;
			case "multiGroupingGrade" : break;
	
			default:
				break;
		}
		
		switch (switchKey) {
			case "namesOfStudents" : break;
			case "streamToArray" : break;
			case "streamToMap" : break;
			case "theNumberOfStudents" : break;
			case "totalScore" : break;
			case "topStudent" : break;
			case "getStat" : break;
			case "nameList" : break;
			case "partioningByMale" : 
			//	List<Customer> list = customerService.partioningByGender(true);
				
				box.put("list", customerService.partioningByGender(true));
				printer.accept(box.get().toString());
				break;
			case "partioningCountPerGender" : break;
			case "partioningTopPerGender" : break;
			case "partioningRejectPerGender" : break;
			case "findByHak" : break;
			case "groupByHak" :
				Iterable<Customer> entities = customerRepository.findGroupByHak();
				List<Customer> list = new ArrayList<>();
				for(Customer p : entities) {
					Customer dto = modelMapper.map(p, Customer.class);
					list.add(dto);
				}
				break;
			case "groupByGrade" : break;
			case "personCountByLevel" : break;
			case "multiGrouping" : break;
			case "multiGroupingMax" : break;
			case "multiGroupingGrade" : break;
	
			default:
				break;
		}

//		return personDTOs.stream()
//				.filter(role-> role.getRole().equals("student"));
//		return list.stream().filter(l-> l.getHak() == proxy.parseInt(searchword) );
		return box.get();
	}
	
	
	
}

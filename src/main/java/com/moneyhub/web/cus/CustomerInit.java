package com.moneyhub.web.cus;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.moneyhub.web.pxy.Proxy;

@Component
public class CustomerInit extends Proxy implements ApplicationRunner{
	private CustomerRepository customerRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	 
	public CustomerInit(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		long count = customerRepository.count();
//		if(count == 0) {
//			Customer customer = null;
//						
//			String[][] mix = {	{ "hong", "1", "홍길동", "010-1234-5678", "1980-01-01", "true", "0", "0", "0", "teacher" },
//								{ "kim", "1", "김유신", "010-3425-6564", "1980-02-12", "true", "0", "0", "0", "manager" },
//								{ "park", "1", "박지성", "010-1234-6546", "1980-03-03", "true", "0", "0", "0", "manager" },
//								{ "you", "1", "유관순", "010-1247-5435", "1980-04-14", "false", "2", "3", "80", "student" },
//								{ "spi", "1", "스파이더맨", "010-2545-2332", "2000-01-21", "true", "1", "1", "90", "student" },
//								{ "bet", "1", "배트맨", "010-4545-4234", "1999-02-12", "true", "2", "1", "70", "student" },
//								{ "ant", "1", "앤트맨", "010-4563-2147", "2001-03-24", "true", "3", "3", "50", "student" },
//								{ "sup", "1", "슈퍼맨", "010-4567-7562", "1990-06-06", "true", "4", "4", "80", "student" },
//								{ "won", "1", "원더우먼", "010-4534-5678", "1980-04-13", "false", "1", "1", "40", "student" },
//								{ "ion", "1", "아이언맨", "010-1274-7867", "2001-09-05", "true", "3", "2", "20", "student" },
//								{ "bla", "1", "블랙위도우", "010-67565-4577", "2002-08-07", "false", "1", "1", "70", "student" },
//								{ "spi1", "1", "스파이더맨1", "010-3241-7861", "2001-01-21", "true", "4", "4", "90", "student" },
//								{ "spi2", "1", "스파이더맨2", "010-3542-7862", "2002-01-21", "true", "1", "2", "80", "student" },
//								{ "spi3", "1", "스파이더맨3", "010-3543-7863", "2003-01-21", "true", "1", "3", "70", "student" },
//								{ "spi4", "1", "스파이더맨4", "010-3544-7864", "2004-01-21", "true", "1", "4", "60", "student" },
//								{ "spi5", "1", "스파이더맨5", "010-3545-7865", "2005-01-21", "true", "2", "1", "50", "student" },
//								{ "spi6", "1", "스파이더맨6", "010-3546-7866", "2006-01-21", "true", "2", "2", "40", "student" },
//								{ "spi7", "1", "스파이더맨7", "010-3547-7867", "2007-01-21", "true", "2", "3", "30", "student" },
//								{ "spi8", "1", "스파이더맨8", "010-3548-7868", "2008-01-21", "true", "3", "1", "20", "student" },
//								{ "spi9", "1", "스파이더맨9", "010-3549-7869", "2009-01-21", "true", "3", "2", "10", "student" },
//								{ "mo", "1", "모모", "010-3549-1869", "1994-06-05", "false", "3" ,"4", "87", "student" },
//				                { "sa", "1", "사나", "010-3549-2869", "1992-06-05", "false", "2" ,"1", "42", "student" },
//				                { "ji", "1", "지효", "010-3549-3869", "1992-06-05", "false", "1" ,"2", "98", "student" },
//				                { "da", "1", "다현", "010-3549-4869", "1994-06-05", "false", "3" ,"4", "75", "student" },
//				                { "jj", "1", "쯔위", "010-3549-5869", "1996-06-05", "false", "2" ,"3", "67", "student" },
//				                { "cy", "1", "채영", "010-3549-6869", "1999-06-05", "false", "1" ,"2", "45", "student" },
//				                { "na", "1", "나연", "010-3549-7869", "1995-06-05", "false", "2" ,"1", "82", "student" },
//				                { "jung", "1", "정연", "010-3549-8869", "1995-06-05", "false", "3" ,"3", "68", "student" },
//				                { "mi", "1", "미나", "010-3549-9869", "1992-06-05", "false", "2" ,"2", "47", "student" },
//				                { "im", "1", "임꺽정", "010-3549-0869", "1992-06-05", "true", "1" ,"4", "52", "student" },
//				                { "iu", "1", "아이유", "010-3549-0169", "1994-06-05", "false", "2" ,"4", "96", "student" },
//				                { "yjs", "1", "유재석", "010-3549-0269", "1998-06-05", "true", "3" ,"1", "37", "student" },
//				                { "ksr", "1", "김수로", "010-3549-0369", "1990-06-05", "true", "2" ,"3", "83", "student" },
//				                { "jo", "1", "조세호", "010-3549-0469", "1991-06-05", "true", "2" ,"2", "72", "student" },
//				                { "yang", "1", "양세찬", "010-3549-0569", "1999-06-04", "true", "3" ,"2", "95", "student" } };
//
//			
//			for(String arr[] : mix) {
//				customer = new Customer();
//				customer.setCemail(arr[0]);
//				customer.setCpwd(arr[1]);
//				customer.setCname(arr[2]);
//				customer.setCphone(arr[3]);
//				customer.setSdate(df.parse(arr[4]));
//				customer.setMale(Boolean.parseBoolean(arr[5]));
//				customer.setHak(parseInt(arr[6]));
//				customer.setBan(parseInt(arr[7]));
//				customer.setScore(parseInt(arr[8]));
//				customer.setRole(arr[9]);
//				
//				customerRepository.save(customer);
//			}
//		}
//	}
}

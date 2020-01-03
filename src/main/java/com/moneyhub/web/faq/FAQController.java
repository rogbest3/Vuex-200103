package com.moneyhub.web.faq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyhub.web.util.Printer;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class FAQController {
//
//	@Autowired private FAQRepository faqRepository;
//	
//	@Autowired private Printer printer;
//	
//	@RequestMapping("/")
//	public String index() {
//		Iterable<FAQ> all = faqRepository.findAll();
//		StringBuilder sb = new StringBuilder();
//		all.forEach(p -> sb.append(p.getCemail() + " "));
//		return sb.toString();
//	}
//	
//	
}

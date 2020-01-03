package com.moneyhub.web.pxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sun.org.glassfish.external.arc.Taxonomy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

@Component("artProxy")
public class ArticleProxy extends Proxy{

	@Autowired Inventory<String> inventory;
	@Autowired Box<String> box;
	
	
/*	public String makeContent() {
		trunk.put(Arrays.asList("site","srch"), Arrays.asList("직접입력", "송금"));
		box = crawler.engine(trunk.get());
		ArrayList<String> t = box.get();
		Collections.shuffle(t);
		return t.get(0);
	}*/
	public String makeEmail() {
		List<String> emailList = Arrays.asList("cpmanck@naver.com", "nl5not2@netian.com", "kdjclr@gmail.com", 
				"jvv1ej2h@daum.net", "pkxgsld5v@nate.com", "gz21m3w@daum.net", "mn76esvn@hanmir.com", "a2xhmhj@yahoo.co.kr", 
				"shqichrb@empal.com", "j69ebnz25s@freechal.com", "tgvt78a@korea.com", "e9wy9u1@hanmail.net");
		return "";
	}
	public Box<String> makeContent() {
	//	box.put(Arrays.asList("site","srch"), Arrays.asList("직접입력", "송금"));

		return null;
	}
	
	@Transactional
	public void insertArticles() {
		for(int i = 1; i<=50; i++) {
			
		}
		//	makeArticle(i);
	}
}
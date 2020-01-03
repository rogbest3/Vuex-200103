package com.moneyhub.web.util;
import java.util.function.Consumer;
import org.springframework.stereotype.Service;

@Service
public class Printer {

	public void accept(Object o) {
		Consumer<String> c = System.out :: println;	//	syso
		c.accept((String)o);
	}
}
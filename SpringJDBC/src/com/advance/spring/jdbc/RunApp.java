package com.advance.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class RunApp {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		DataService service = (DataService) context.getBean("dataservice");
		service.printNews();

	}

}

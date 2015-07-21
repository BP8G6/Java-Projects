package com.springexample.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld h = (HelloWorld)context.getBean("helloworld");
		h.printMethod();		

	}

}

package com.springexample.config.usginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ColorApp {
	
	public static void main(String[] args)
	{		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MyColor color = (MyColor)context.getBean("mycolor");
		color.printcolor();
	}
	
}

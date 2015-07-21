package com.advance.spring;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	private FlightBookingService service;  //= new FlightBookingService();
	public static void main(String[] args) {
		
		/*RunApp application = new RunApp();
		application.service.bookFlight("Balakrishna", "United");*/
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// For Springs FlightBooking Example
		
		
		/*FlightBookingService service = (FlightBookingService) context.getBean("FlightBookingService"); //here id should match with spring.xml id
		
		service.bookFlight("Balakrishna", "United");*/
		
		
		Employee e = (Employee) context.getBean("employee"); // employee should match with spring.xml id
		System.out.println(e.toString());
		
		
		
		
		

	}

}

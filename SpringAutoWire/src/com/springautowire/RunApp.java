package com.springautowire;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;





public class RunApp {

	
	public static void main(String[] args) {
	  
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("spring.xml");  
	      
	    FlightBookingService e=(FlightBookingService)context.getBean("fb");  
	    e.bookFlight("Balakrishna","United"); 
		
	}

}

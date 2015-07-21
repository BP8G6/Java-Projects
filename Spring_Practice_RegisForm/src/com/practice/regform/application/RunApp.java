package com.practice.regform.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.regform.domain.RegForm;
import com.practice.regform.domain.RegForm2;
import com.practice.regform.service.RegFormService;

public class RunApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		RegFormService service = (RegFormService)context.getBean("regform");
		service.printRegForm();
		
		
		
		System.out.println("*********************************Printing Using Row Mapper***************************************");
		for(RegForm r :service.printRegDet())
		{
			System.out.println(r);
		}
		

		System.out.println("*********************************Printing Using Bean Property Row Mapper***************************************");
		for(RegForm2 r :service.pringRegUsngBean())
		{
			System.out.println(r);
		}
		
		
		System.out.println("*********************************Inserting Data Into PostGres***************************************");
		
		RegForm reg = new RegForm(4,"Ponnam","Krishna","M","(361)522-7462","balakrishna.ponnam@gmail.com","4922 Apt #11 Grand Ave","Kansas City","Missouri",64112);
		
		System.out.println("commented code for insertion");
		//service.saveDetails(reg);
		
		
		System.out.println("*********************************Search Results By Id*************************************************");
		RegForm reg_id =service.getDetailsById(1L);
		System.out.println(reg_id);
		
		System.out.println("******************************Search Results By Query************************************************");
	}
	
	

}

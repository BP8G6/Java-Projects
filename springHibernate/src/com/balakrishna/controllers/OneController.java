package com.balakrishna.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.hibernate.entities.Address;
import com.balakrishna.hibernate.entities.Contact;
import com.balakrishna.hibernate.entities.EmploymentHistory;
import com.balakrishna.hibernate.entities.Person;
import com.balakrishna.service.PersonService;

@Controller
public class OneController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getMyPage(){
		// add my person nobjects from db 
		
		/*Person p = new Person("Test3", "Test", "Test3");
		
		Set<EmploymentHistory> employmentHistory = new HashSet<EmploymentHistory>();
		
		EmploymentHistory em = new EmploymentHistory("Test Client Name", "Test", "Test", "22182", "USA", p);
		employmentHistory.add(em);
		p.setEmploymentHistory(employmentHistory);
		
		Set<Address> address = new HashSet<Address>();
		Address a = new Address("Person Address", "Person Address", "19131", "USA");
		a.setPerson(p);
		
		Set<Contact> contact = new HashSet<Contact>();
		Contact c = new Contact(p, a, "test@gmail.com", "1901234567890", "09875432");
		a.setContact(c);
		c.setAddress(a);
		
		address.add(a);
		contact.add(c);
		
		p.setAddress(address);
		p.setContact(contact);
		
		personService.persistPerson(p);
		*/
		
		
		return new ModelAndView("home").addObject("persons", personService.getAllPersons());
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public ModelAndView getRegisterPage(){
		ModelAndView mav = new ModelAndView("register");
		Person person = new Person();
		
		return mav;
	}
	
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView getRegistrationPageDetails(Person person){
		System.out.println(person);
		ModelAndView mav = new ModelAndView("register");
		
		return mav;
	}
	
}

package com.balakrishna.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.hibernate.entities.Address;
import com.balakrishna.hibernate.entities.Contact;
import com.balakrishna.hibernate.entities.EmploymentHistory;
import com.balakrishna.hibernate.entities.FormData;
import com.balakrishna.hibernate.entities.Person;
import com.balakrishna.service.PersonService;

@Controller
public class OneController {
	
	@Autowired
	private PersonService personService;
	
	Person per = new Person();
	
	Address addr ;
	Contact contact;
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getMyPage(){
		// add my person nobjects from db 
		
		/*Person p = new Person("Balakrishna", "Ponnam", "Inidan");
		
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
		
		personService.persistPerson(p);*/
		
		
		
		return new ModelAndView("home").addObject("persons", personService.getAllPersons());
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public ModelAndView getFormPage() {
		
		ModelAndView mav = new ModelAndView("register");
		FormData fData = new FormData();
		mav.addObject("FormData", fData);
		return mav;
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView getFormPageWithData(@ModelAttribute("register") FormData fd) {
		System.out.println("posted");
		ModelAndView mav = new ModelAndView("home");
		System.out.println(fd);
		
		Person p = new Person(fd.getFirstName(), fd.getLastName(), fd.getCitizenship());
		
		Set<EmploymentHistory> employmentHistory = new HashSet<EmploymentHistory>();
		
		EmploymentHistory em = new EmploymentHistory(fd.getClientName(),fd.getClientAddress1(),fd.getClientAddress2(),fd.getClientZip(),fd.getClientCountry(),p);
		
		/*EmploymentHistory em = new EmploymentHistory("Test Client Name", "Test", "Test", "22182", "USA", p);*/
		employmentHistory.add(em);
		p.setEmploymentHistory(employmentHistory);
		
		Set<Address> address = new HashSet<Address>();
		Address a = new Address(fd.getAddress1(),fd.getAddress2(),fd.getZip(),fd.getCountry());
		/*Address a = new Address("Person Address", "Person Address", "19131", "USA");*/
		a.setPerson(p);
		
		Set<Contact> contact = new HashSet<Contact>();
		Contact c = new Contact(p, a, fd.getEmail(), fd.getPrimaryPhone(), fd.getSecondaryPhone());
		/*Contact c = new Contact(p, a, "test@gmail.com", "1901234567890", "09875432");*/
		a.setContact(c);
		c.setAddress(a);
		
		address.add(a);
		contact.add(c);
		p.setAddress(address);
		p.setContact(contact);
		personService.persistPerson(p);
		
		return mav;
	}
	
	
	@RequestMapping(value="/personreg",method=RequestMethod.GET)
	public ModelAndView getPersonFormPage() {		
		ModelAndView mav = new ModelAndView("person_form");		
		mav.addObject("perdata", per);
		return mav;
	}
	
	
	@RequestMapping(value="/personreg",method=RequestMethod.POST)
	public ModelAndView getPersonPostFormPage(@ModelAttribute("perdata")Person p) {		
		System.out.println(p);
		per=p;
		ModelAndView mav = new ModelAndView("emphist_form");
		mav.addObject("persondata",p);
		EmploymentHistory emphist = new EmploymentHistory();
		mav.addObject("emphistdata", emphist);	
		System.out.println(p);
		
		return mav;
		
	}
	
	
	@RequestMapping(value="/emphistreg",method=RequestMethod.POST)
	public ModelAndView getEmpHistPostFormPage(@ModelAttribute("emphistdata")EmploymentHistory e) {		
		ModelAndView mav = new ModelAndView("address_form");
		//Address addr = new Address();
		mav.addObject("addrdata",new Address());
		System.out.println(e);
		EmploymentHistory eh = new EmploymentHistory(e.getClientName(), e.getClientAddress1(), e.getClientAddress2(), e.getClientZip(), e.getClientCountry(), per);
		
		Set s = new HashSet<EmploymentHistory>();
		s.add(eh);
		per.setEmploymentHistory(s);
		
		
		return mav;
	}
	
	@RequestMapping(value="/addressregis",method=RequestMethod.POST)
	public ModelAndView getEmpHistFormPage(@ModelAttribute("addrdata")Address a) {		
		ModelAndView mav = new ModelAndView("contact_form");
		//Contact contact = new Contact();
		addr = new Address(a.getAddress1(), a.getAddress2(), a.getZip(), a.getCountry());
		addr.setPerson(per);
		System.out.println(a);
		System.out.println("balakrishna");
		mav.addObject("contactdata", new Contact());
		Set s = new HashSet<Address>();
		s.add(addr);
		per.setAddress(s);
		return mav;
	}
	

	
	@RequestMapping(value="/contactregis",method=RequestMethod.POST)
	public ModelAndView getAddrContactFormPostPage(@ModelAttribute("contactdata")Contact c) {		
		ModelAndView mav = new ModelAndView("home");
		System.out.println(c);	
		contact = new Contact(per, addr, c.getEmail(), c.getPrimaryPhone(), c.getSecondaryPhone());
		Set s = new HashSet<Contact>();
		s.add(contact);
		per.setContact(s);
		addr.setContact(contact);
		personService.persistPerson(per);
		return mav;
	}

}
	


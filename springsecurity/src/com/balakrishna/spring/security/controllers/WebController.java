package com.balakrishna.spring.security.controllers;

import java.security.Principal;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public ModelAndView getDashboardPage(Principal principal){
		System.out.println("LoggedinUser for /dashboard     "+principal.getName());
		return new ModelAndView("dashboard");
	}
	
	@Secured(value = { "ROLE_ADMIN" })
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView getAdminPage(Principal principal){
		System.out.println("LoggedinUser for /admin     "+principal.getName());
		return new ModelAndView("admin");
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLoginPage(Principal principal){
		return new ModelAndView("login");
	}
	@RequestMapping(value="/reports",method=RequestMethod.GET)
	public ModelAndView getReportsPage(Principal principal){
		System.out.println("LoggedinUser for /reports     "+principal.getName());
		return new ModelAndView("reports");
	}

}

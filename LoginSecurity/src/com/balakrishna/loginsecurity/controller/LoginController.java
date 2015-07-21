package com.balakrishna.loginsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
@RequestMapping(value="/",method=RequestMethod.GET)	
public ModelAndView getHomePage()
{
	return new ModelAndView("home");
}


@RequestMapping(value="/signin",method=RequestMethod.GET)	
public ModelAndView getLoginPage()
{
	return new ModelAndView("login");
}



@RequestMapping(value="/register",method=RequestMethod.GET)	
public ModelAndView getRegistrationPage()
{
	return new ModelAndView("register");
}

@RequestMapping(value="/report",method=RequestMethod.GET)	
public ModelAndView getReportsPage()
{
	return new ModelAndView("report");
}

@RequestMapping(value="/dashboard",method=RequestMethod.GET)	
public ModelAndView getDashboardsPage()
{
	return new ModelAndView("dashboard");
}



@RequestMapping(value="/denied",method=RequestMethod.GET)	
public ModelAndView getDeniedPage()
{
	return new ModelAndView("logout");
}
	
}

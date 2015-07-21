package com.balakrishna.flickr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.flickr.entities.UserDetails;
import com.balakrishna.flickr.service.FlickrService;

@Controller
public class FlickrController {

	@Autowired
	private FlickrService flickrService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		//System.out.println("balakrishna");
		ModelAndView mav = new ModelAndView("home");		
		return mav;
	}
	
	
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public ModelAndView getSignUpPage(){
		ModelAndView mav=new ModelAndView("signup");
		UserDetails user = new UserDetails();
		mav.addObject("userdata",user);		
		return mav;
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView getSignUpPostPage(@ModelAttribute("userdata")UserDetails u ){		
		flickrService.saveUserDetails(u);
		ModelAndView mav=new ModelAndView("home");
		return mav;
	}
		
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView getLoginPage(){
		ModelAndView mav=new ModelAndView("login");	
		UserDetails login = new UserDetails();
		mav.addObject("logindata",login);
		return mav;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView getLoginPostPage(@ModelAttribute("logindata")UserDetails lg){	
		
		ModelAndView mav = new ModelAndView();
		if(flickrService.getUsernamePwd(lg.getEmail(), lg.getPassword())!=null)
		{
			mav.setViewName("home");			
		}
		else
		{
			mav.setViewName("denied");
		}
		
		return mav;
	}
}

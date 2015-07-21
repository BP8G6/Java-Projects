package com.balakrishna.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.beans.News;

@Controller
public class WebController {
	
	@RequestMapping(value="/",method=RequestMethod.GET) // by default your controller acts as get
	public ModelAndView myFirstMVCPage()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("one");		
		return mav;
		
	}
	
		
	@RequestMapping(value="/second",method=RequestMethod.GET)
	public ModelAndView mySecondMVCPage()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("two");
		mav.addObject("message","This is first Object of Spring MVC");	
		mav.addObject("text","This is second Object of Spring MVC");			
		return mav;

	}
	
	@RequestMapping(value="/third",method=RequestMethod.GET)
	public ModelAndView myThirdController(){
		
		ModelAndView mav = new ModelAndView();		
		mav.setViewName("three");
		News n =new News(System.currentTimeMillis(),"Bellinfo is doing Great","it is a java class","Technology");
		mav.addObject("mynews", n);
		return mav;
	}
	
	@RequestMapping(value="/fourth",method=RequestMethod.GET)
	public ModelAndView myFourthController()
	{
		ModelAndView mav = new ModelAndView();		
		mav.setViewName("four");
		List<News> allnews = new ArrayList();
		News n1 =new News(System.currentTimeMillis(),"Bellinfo is doing Great","it is a java class","Technology");
		News n2 =new News(System.currentTimeMillis(),"Bellinfo is doing Great","it is a SQL class","Technology");
		News n3 =new News(System.currentTimeMillis(),"Bellinfo is doing Great","it is a UI class","Technology");
		allnews.add(n1);
		allnews.add(n2);
		allnews.add(n3);
		mav.addObject("newslist", allnews);
		
		return mav;
	}
	
	@RequestMapping(value="/fifth",method=RequestMethod.GET)
	public ModelAndView myFifthController(@RequestParam("q") Long q, @RequestParam("y") String y)
	{
		ModelAndView mav = new ModelAndView();		
		mav.setViewName("five");
		
		
		//To - Do here we go and call a service like this
		//News n = service.getNewsById(q);
		
		
		News n =new News(q,"Bellinfo is doing Great","it is a java class",y);		
		
		mav.addObject("newslist",n );
		
		return mav;
	}
	
	
	@RequestMapping(value="/sixth/{id}/{newsType}",method=RequestMethod.GET)
	public ModelAndView mySixthController(@PathVariable("id") Long id, @PathVariable("newsType") String newsType)
	{
		ModelAndView mav = new ModelAndView();		
		mav.setViewName("five");
		
		
		//To - Do here we go and call a service like this
		//News n = service.getNewsById(q);
		
		
		News n =new News(id,"Bellinfo is doing Great","it is a java class",newsType);		
		
		mav.addObject("newslist",n );
		
		return mav;
	}
	
	
	
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView getForm()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		News n = new News();
		mav.addObject("news", n);
		return mav;
	}
	
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView getFormEdit(@RequestParam("id") Long id)
	{
		System.out.println("fetching the news with ID >>>>..."+id);
		//i am gng to fetch the news object with id and passing to jsp engine to render in the input fields
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		News n = new News(id,"fetched news object from id","this is my main story","spring");
		mav.addObject("news", n);
		return mav;
	}
	
	
	@RequestMapping(value="/form",method=RequestMethod.POST)
	public ModelAndView getFormWithData(@ModelAttribute("news")News news)
	{
		System.out.println(news);
		
		
		//Calling a service and doing something we like
		ModelAndView mav = new ModelAndView();
		mav.setViewName("submitedform");
		//News n = new News();
		mav.addObject("news", news);
		return mav;
	}

}

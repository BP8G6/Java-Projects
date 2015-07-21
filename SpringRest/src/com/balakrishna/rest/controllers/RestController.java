package com.balakrishna.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.rest.beans.News;
import com.balakrishna.rest.service.NewsService;

@Controller
public class RestController {
	
	@Autowired
	private NewsService newsService;

	@ResponseBody
	@RequestMapping(value="/news",method=RequestMethod.GET)
	public List<News> getAllNews()
	{
		return newsService.getAllNews();
	}
	
}

package com.balakrishna.newsx.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.balakrishna.newsx.domain.News;
import com.balakrishna.newsx.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getWelcomePage()
	{
		ModelAndView mav = new ModelAndView("home");
		
		mav.addObject("allnews",newsService.getEveryNewsFromMyDB());
		mav.addObject("carouselnews",newsService.getNewsForCarouselByNewsType(null));
		mav.addObject("chartdata",newsService.getChartData());
		
		return mav;
	}
	
	@RequestMapping(value="/addnews",method=RequestMethod.GET)
	public ModelAndView getAddNewsPage()
	{
		ModelAndView mav = new ModelAndView("addnews");
		mav.addObject("news",new News());
		List<String> newsTypes = new ArrayList<String>();
		newsTypes.add("Politics");
		newsTypes.add("Technology");
		newsTypes.add("Science");
		newsTypes.add("Sports");
		newsTypes.add("World");
		newsTypes.add("Alience");
		mav.addObject("newsTypes",newsTypes);
		return mav;
	}
	
	
	@RequestMapping(value="/addnews",method=RequestMethod.POST)
	public ModelAndView getAddNewsPageWithData(@ModelAttribute("news")News news)
	{
		ModelAndView mav = new ModelAndView("home");
		//System.out.println(news);
		
		//go to Db And persist latest news
		newsService.saveLatestNews(news);
		mav.addObject("allnews",newsService.getEveryNewsFromMyDB());
		mav.addObject("carouselnews",newsService.getNewsForCarouselByNewsType(null));
		mav.addObject("chartdata",newsService.getChartData());
		return mav;
	}
	
	
	
	/*@RequestMapping(value="/news",method=RequestMethod.GET)
	public ModelAndView getNewsPage()
	{
		ModelAndView mav = new ModelAndView("news");
		
		return mav;
	}*/
	
	
	@RequestMapping(value="/news",method=RequestMethod.GET)
	public ModelAndView getNewsPage(@RequestParam("id")Long id)
	{
		ModelAndView mav = new ModelAndView("news");
		News n=newsService.getNewsByNewsId(id);
		mav.addObject("news",n);
		mav.addObject("recommendednews",newsService.getRecommendedNewsByNewsType(n.getNewsType(), 5L));
		
		return mav;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView getSearchResults(@RequestParam("query")String query)
	{
		ModelAndView mav = new ModelAndView("home");	

		mav.addObject("allnews",newsService.searchNews(query));
		mav.addObject("carouselnews",newsService.getNewsForCarouselByNewsType(null));
		mav.addObject("chartdata",newsService.getChartData());
		
		return mav;
	}
	
	@RequestMapping(value="/news/{type}",method=RequestMethod.GET)
	public ModelAndView getNewsByChartClick(@PathVariable("type")String type){
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("allnews",newsService.getAllNewsByNewsType(type));
		mav.addObject("carouselnews",newsService.getNewsForCarouselByNewsType(type));
		mav.addObject("chartdata",newsService.getChartData());
		
		return mav;
	}
	
}

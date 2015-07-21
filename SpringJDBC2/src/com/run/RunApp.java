package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newsx.domain.News;
import com.newsx.domain.News2;
import com.newsx.domain.NewsMetric;
import com.newsx.domain.NewsxConstants;
import com.newsx.service.NewsService;

public class RunApp {
	
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 NewsService service = (NewsService )context.getBean("newsservice");
		 
		/* service.printNews();
		 
		System.out.println("For News one...............");
		  for(News n :service.getNews())
		 {
			 System.out.println(n);
		 }
		 
		  System.out.println("For NewsTwo...............");
		 for(News2 n :service.getDefaultNews())
		 {
			 System.out.println(n);
		 }
		 */
		 
		 
	/*	 News n = new News(System.currentTimeMillis(),"Microsoft developing Linux","Microsoft developing Linux","www.microsoft.com","www.microsoft.com",NewsxConstants.TECHNOLOGY_TYPE);
		service.saveNews(n);
	
		for(News news:service.getNews())
		{
			System.out.println(news);
		}*/
		 
	//News n=	 (News) service.searchNewsByQuery("apple");
	System.out.println("**********************************Search Based on Query*****************************************************");
	for(News news:service.searchNewsByQuery("microsoft"))
	{
		System.out.println(news);
	}
	for(News news:service.searchNewsByQuery("apple"))
	{
		System.out.println(news);
	}
	
	System.out.println("********************************Searcg Based on Type*********************************************************");
	for(News news:service.getNewsByType(NewsxConstants.POLITICAL_TYPE))
	{
		System.out.println(news);
	}
	
	
	System.out.println("**********************************Geting the Count Based on Type********************************************");
	
	for(NewsMetric news:service.getNewsMetricByType())
	{
		System.out.println(news);
	}
	
	System.out.println("*********************************Get News By Id********************************");
	News h=service.getNewsById(1435713140357L);
	
	System.out.println(h);
	
		 
		 
		 
		 
		
		
		
	}

}

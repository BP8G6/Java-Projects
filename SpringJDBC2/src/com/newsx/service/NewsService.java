package com.newsx.service;

import java.util.List;

import com.newsx.domain.News;
import com.newsx.domain.News2;
import com.newsx.domain.NewsMetric;

public interface NewsService {
	
	public void printNews();
	
	public List<News> getNews();
	
	public List<News2> getDefaultNews();
	
	public void saveNews(News news);
	
	public News getNewsById(Long newsId);
	
	public List<News> searchNewsByQuery(String query);
	
	public List<News> getNewsByType(String newsType);
	
	public List<NewsMetric> getNewsMetricByType();

	

}

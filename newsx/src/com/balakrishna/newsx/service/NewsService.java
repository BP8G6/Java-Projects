package com.balakrishna.newsx.service;

import java.util.List;

import com.balakrishna.newsx.domain.News;
import com.balakrishna.newsx.domain.NewsMetric;

public interface NewsService {
	
	
	public List<News> getEveryNewsFromMyDB();
	
	public News getNewsByNewsId(Long id);
	
	public void saveLatestNews(News news);
	
	public List<News> searchNews(String str);
	
	public List<News> getAllNewsByNewsType(String str);

	public List<News> getNewsForCarouselByNewsType(String str);
	
	public List<News> getRecomendedNewsByNewsType(String str);
	
	public List<NewsMetric> getNewsMetric();
	
	public List<News> getRecommendedNewsByNewsType(String str,Long count);
	
	public String getChartData();
}

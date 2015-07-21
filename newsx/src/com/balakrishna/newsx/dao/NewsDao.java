package com.balakrishna.newsx.dao;

import java.util.List;





import com.balakrishna.newsx.domain.News;
import com.balakrishna.newsx.domain.NewsMetric;



public interface NewsDao {

	
	public List<News> getAllNews();	
	
	public void persistNews(News news);
	
	public News getNewsById(Long newsId);
	
	public List<News> searchNewsByQuery(String query);
	
	public List<News> getNewsByType(String newsType);
	
	public List<News> getNewsForCarouselByNewsType(String str);
	
	public List<News> getRecomendedNewsByNewsType(String str);
	
	public List<NewsMetric> getNewsMetric();
	
	public List<News> getRecommendedNewsByNewsType(String str,Long count);
	
	
	
}

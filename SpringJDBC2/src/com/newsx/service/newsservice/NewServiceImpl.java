package com.newsx.service.newsservice;

import java.util.List;

import com.newsx.dao.NewsDao;
import com.newsx.domain.News;
import com.newsx.domain.News2;
import com.newsx.domain.NewsMetric;
import com.newsx.service.NewsService;

public class NewServiceImpl implements NewsService {

	private NewsDao newsdao;	
	
	
	public void setNewsdao(NewsDao newsdao) {
		this.newsdao = newsdao;
	}


	@Override
	public void printNews() {
		
		newsdao.printNews();
		
	}
	
	public List<News> getNews(){
		return newsdao.getNews();
	}
	
	public List<News2> getDefaultNews()
	{
		return newsdao.getDefaultNews();
	}


	@Override
	public void saveNews(News news) {
		newsdao.persistNews(news);
		
	}


	@Override
	public News getNewsById(Long newsId) {
		// TODO Auto-generated method stub
		return newsdao.getNewsById(newsId);
	}


	@Override
	public List<News> searchNewsByQuery(String query) {
		// TODO Auto-generated method stub
		return newsdao.searchNewsByQuery(query);
	}


	@Override
	public List<News> getNewsByType(String newsType) {
		// TODO Auto-generated method stub
		return newsdao.getNewsByType(newsType);
	}


	@Override
	public List<NewsMetric> getNewsMetricByType() {
		// TODO Auto-generated method stub
		return newsdao.getNewsMetricByType();
	}
	
	


	

}

package com.balakrishna.newsx.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balakrishna.newsx.dao.NewsDao;
import com.balakrishna.newsx.domain.News;
import com.balakrishna.newsx.domain.NewsMetric;
import com.balakrishna.newsx.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsdao;

	@Override
	public List<News> getEveryNewsFromMyDB() {
		// TODO Auto-generated method stub
		return newsdao.getAllNews();
	}

	@Override
	public News getNewsByNewsId(Long id) {
		// TODO Auto-generated method stub
		return newsdao.getNewsById(id);
	}

	@Override
	public void saveLatestNews(News news) {
		// TODO Auto-generated method stub
		newsdao.persistNews(news);
	}

	@Override
	public List<News> searchNews(String str) {
		// TODO Auto-generated method stub
		return newsdao.searchNewsByQuery(str);
	}

	@Override
	public List<News> getAllNewsByNewsType(String str) {
		// TODO Auto-generated method stub
		return newsdao.getNewsByType(str);
	}

	@Override
	public List<News> getNewsForCarouselByNewsType(String str) {
		// TODO Auto-generated method stub
		return newsdao.getNewsForCarouselByNewsType(str);
	}

	@Override
	public List<News> getRecomendedNewsByNewsType(String str) {
		// TODO Auto-generated method stub
		return newsdao.getRecomendedNewsByNewsType(str);
	}

	@Override
	public List<NewsMetric> getNewsMetric() {
		// TODO Auto-generated method stub
		return newsdao.getNewsMetric();
	}

	@Override
	public List<News> getRecommendedNewsByNewsType(String str, Long count) {
		// TODO Auto-generated method stub
		return newsdao.getRecommendedNewsByNewsType(str,count);
	}

	@Override
	public String getChartData() {
		// TODO Auto-generated method stub
		
				
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(NewsMetric nm: getNewsMetric())
		{
			sb.append("{  y:"+nm.getCount()+", label:\" "+nm.getNewsType()+ "\" },");
			
		}
		sb.append("]");
		return sb.toString();
	}

}

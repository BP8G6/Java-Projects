package com.newsx.dao.newsdao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.newsx.dao.NewsDao;
import com.newsx.domain.News;
import com.newsx.domain.News2;
import com.newsx.domain.NewsMetric;
import com.newsx.domain.NewsRowMapper;

public class NewsDaoImpl implements NewsDao {
	
	/*private DataSource datasource;*/
	private JdbcTemplate jdbcTemplate;	
	
		
	
	/*public void setDatasource(DataSource datasource) {
		this.datasource = datasource;		
		this.jdbcTemplate=new JdbcTemplate(datasource);
	}*/
	//System.out.println(datasource);


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public void printNews() {
		
		List<Map<String,Object>> rows=jdbcTemplate.queryForList("Select * From news");		
		
		for(Map<String,Object>row : rows)
			for(Map.Entry<String, Object>entry :row.entrySet()){
			
			System.out.println(entry.getKey()+ "  >>>>>> "+entry.getValue());
			}
		
	}


	@Override
	public List<News> getNews() {
		
		List<News> news = jdbcTemplate.query("Select * From news",new NewsRowMapper());
		return news;				
		
		//Can also write in this way
		/*
		 * List<News> news =  new ArrayList<News>();		
		List<Map<String,Object>> rows=jdbcTemplate.queryForList("Select * From news");
		 * News n= new News();
		for(Map<String,Object>row : rows)	
			for(Map.Entry<String, Object>entry :row.entrySet()){
				System.out.println(entry.getKey()+ "  >>>>>> "+entry.getValue());
				if(entry.getKey().equalsIgnoreCase("mainstory"))
				{
					n.setMainstory((String) entry.getValue());
				}
				
			}
		news.add(n);*/
		
	}
	
	public List<News2> getDefaultNews()
	{		
		List<News2> news = jdbcTemplate.query("Select * From news",new BeanPropertyRowMapper<News2>(News2.class));
		//System.out.println(news);
		return news;
	}


	@Override
	public void persistNews(News news) {
		
		String insertSQl="Insert Into news(news_id,headlines,mainstory,imageurl,videourl,newstype)"+ 
		"Values(?,?,?,?,?,?)";
		
		//jdbcTemplate.update(insertSQl,new Object[]{news.getId(),news.getHeadlines()});
		
		jdbcTemplate.update(insertSQl,new Object[]{news.getId(),news.getHeadlines(),news.getMainstory(),news.getImageURL(),news.getVideoURL(),news.getNewsType()});
		
	}


	@Override
	public News getNewsById(Long newsId) {
		// TODO Auto-generated method stub		
		
		News news = jdbcTemplate.queryForObject("Select * From news Where news_id=?", new Object[] {newsId},new NewsRowMapper());		
		
		return news;
	}


	@Override
	public List<News> searchNewsByQuery(String query) {
		// TODO Auto-generated method stub
		String q = "select  * from news where upper(headlines) Like upper('%"+query+"%')";
		//System.out.println(q);
		List<News> searchResults = jdbcTemplate.query(q,new NewsRowMapper());		
		return searchResults;
	}


	@Override
	public List<News> getNewsByType(String newsType) {
		// TODO Auto-generated method stub
		List<News> searchResults = jdbcTemplate.query("Select * From news Where newstype= ? ", new Object[]{newsType},new NewsRowMapper());	
		
		return searchResults;
	}


	@Override
	public List<NewsMetric> getNewsMetricByType() {
		// TODO Auto-generated method stub
		
		List<NewsMetric> metrics = jdbcTemplate.query("Select newstype AS \"newsType\", count(*) AS \"Count\" from news group by newstype", new BeanPropertyRowMapper<NewsMetric>(NewsMetric.class));
		return metrics;
	}
}

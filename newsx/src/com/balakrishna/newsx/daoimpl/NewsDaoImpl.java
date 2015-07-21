package com.balakrishna.newsx.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.balakrishna.newsx.dao.NewsDao;
import com.balakrishna.newsx.domain.News;
import com.balakrishna.newsx.domain.NewsMetric;



@Repository
public class NewsDaoImpl implements NewsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<News> getAllNews() {
		
		//System.out.println(jdbcTemplate.query("Select * From news", new BeanPropertyRowMapper<News>(News.class)));
		return jdbcTemplate.query("Select * From news", new BeanPropertyRowMapper<News>(News.class));
	}

	@Override
	public void persistNews(News news) {

		news.setId(System.nanoTime());
		String insertSQl="Insert Into news(news_id,headlines,mainstory,imageurl,videourl,newstype)"+ 
				"Values(?,?,?,?,?,?)";
								
				jdbcTemplate.update(insertSQl,new Object[]{news.getId(),news.getHeadlines(),news.getMainstory(),news.getImageURL(),news.getVideoURL(),news.getNewsType()});
				
	}

	@Override
	public News getNewsById(Long newsId) {
		News news = jdbcTemplate.queryForObject("Select * From news Where news_id=?", new Object[] {newsId},new BeanPropertyRowMapper<News>(News.class));		
		
		return news;
	}

	@Override
	public List<News> searchNewsByQuery(String query) {
		
		String q = "select  * from news where upper(headlines) Like upper('%"+query+"%')";
		//System.out.println(q);
		//return searchResults = jdbcTemplate.query(q,new BeanPropertyRowMapper<News>(News.class));		
		return jdbcTemplate.query(q,new BeanPropertyRowMapper<News>(News.class));	
	}

	@Override
	public List<News> getNewsByType(String newsType) {
		List<News> searchResults = jdbcTemplate.query("Select * From news Where newstype= ? ", new Object[]{newsType},new BeanPropertyRowMapper<News>(News.class));	
		
		return searchResults;
	}

	

	@Override
	public List<News> getNewsForCarouselByNewsType(String str) {
		// TODO Auto-generated method stub
		String query="";
		if(StringUtils.isEmpty(str)){
		
			query="select * from news order by Random() limit 4";
		}
		else
		{		
			query="select * from news where newstype= '"+str+"' order by Random() limit 4";
		}
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<News>(News.class));
	}

	@Override
	public List<News> getRecomendedNewsByNewsType(String str) {
		
		String query="select * from news where newstype= '"+str+"' order by Random() limit 10";
		
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<News>(News.class));
	}

	@Override
	public List<NewsMetric> getNewsMetric() {	
		
		return jdbcTemplate.query("Select newstype AS \"newsType\", count(*) AS \"Count\" from news group by newstype", new BeanPropertyRowMapper<NewsMetric>(NewsMetric.class));
		
	}

	@Override
	public List<News> getRecommendedNewsByNewsType(String str, Long count) {
		// TODO Auto-generated method stub
		String query;
		if(count==0){
			
			query="select * from news where newstype= '"+str+"' order by Random() limit 25";
		}else{
			
			query="select * from news where newstype= '"+str+"' order by Random() limit " +count;
		}
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<News>(News.class));
	}

}

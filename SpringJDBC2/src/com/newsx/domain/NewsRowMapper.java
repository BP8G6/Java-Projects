package com.newsx.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NewsRowMapper implements RowMapper<News>{

	@Override
	public News mapRow(ResultSet arg0, int arg1) throws SQLException {
			
		
		News n = new News();
		n.setId(arg0.getLong(1));
		n.setHeadlines(arg0.getString(2));
		n.setMainstory(arg0.getString(3));
		n.setVideoURL(arg0.getString(4));
		n.setImageURL(arg0.getString(5));
		n.setNewsType(arg0.getString(6));
		
		return n;
		
	}
	

}

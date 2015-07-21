package com.balakrishna.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balakrishna.rest.beans.News;
import com.balakrishna.rest.dao.NewsDao;
import com.balakrishna.rest.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsDao;
	
	
	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDao.getAllNews();
	}

}

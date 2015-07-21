package com.balakrishna.flickr.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balakrishna.flickr.dao.FlickrDao;
import com.balakrishna.flickr.entities.UserDetails;

@Service
@Transactional
public class FlickrServiceImpl implements FlickrService {

	@Autowired
	private FlickrDao flickrDao;
	
	@Override
	public void saveUserDetails(UserDetails user) {
		// TODO Auto-generated method stub
		flickrDao.saveUserDetails(user);
		
	}

	@Override
	public UserDetails getUsernamePwd(String username,String pwd) {
		// TODO Auto-generated method stub
		return flickrDao.getUsernamePwd(username,pwd);
	}

	
}

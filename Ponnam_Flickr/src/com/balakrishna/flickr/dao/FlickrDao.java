package com.balakrishna.flickr.dao;

import java.util.List;

import com.balakrishna.flickr.entities.UserDetails;

public interface FlickrDao {

	public void saveUserDetails(UserDetails user);
	
	public UserDetails getUsernamePwd(String username,String pwd);
}

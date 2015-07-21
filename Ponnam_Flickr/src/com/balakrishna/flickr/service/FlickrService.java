package com.balakrishna.flickr.service;

import java.util.List;

import com.balakrishna.flickr.entities.UserDetails;

public interface FlickrService {
	
	public void saveUserDetails(UserDetails user);
	
	public UserDetails getUsernamePwd(String username, String pwd);

}

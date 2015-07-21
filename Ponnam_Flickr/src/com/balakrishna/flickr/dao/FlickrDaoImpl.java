package com.balakrishna.flickr.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.balakrishna.flickr.entities.UserDetails;

@Repository
public class FlickrDaoImpl implements FlickrDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUserDetails(UserDetails user) {

		System.out.println("Ponnam Balakrishna in Dao");
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public UserDetails getUsernamePwd(String username,String pwd) {
		 
       UserDetails ud = (UserDetails) sessionFactory.getCurrentSession().getNamedQuery("getUserPwd").setParameter("pemail", username).setParameter("ppwd", pwd).list().get(0);//.setString("ppwd", pwd);
       System.out.println(ud);
           return ud;
		
		
	}
	
	

}

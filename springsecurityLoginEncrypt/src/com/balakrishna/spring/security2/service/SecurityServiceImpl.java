package com.balakrishna.spring.security2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balakrishna.spring.security2.dao.SecurityDao;
import com.balakrishna.spring.security2.security.SecurityUtils;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private SecurityDao securitydao;
	@Override
	public void createUserAccount(String email, String pwd) {
		// TODO Auto-generated method stub
		securitydao.createUserAccount(email, SecurityUtils.getEncryptedPassword(pwd));
	}

}

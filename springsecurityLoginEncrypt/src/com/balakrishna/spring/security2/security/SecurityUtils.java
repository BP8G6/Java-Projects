package com.balakrishna.spring.security2.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityUtils {

	
	public static String getEncryptedPassword(final String password)
	{
		PasswordEncoder pe = new BCryptPasswordEncoder();
		return pe.encode(password);
	}
	
	
}

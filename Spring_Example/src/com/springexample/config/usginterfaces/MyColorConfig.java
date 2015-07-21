package com.springexample.config.usginterfaces;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {
	
	@Bean(name="mycolor")
	public MyColor getColors()
	{
		return new RedColor();
		
	}

}

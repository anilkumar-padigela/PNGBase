package com.png.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	public Config() {
		// TODO Auto-generated constructor stub
	}

	
	@Bean
	public  RestTemplate restTemplat() {
		return new RestTemplate();
	}
	
}

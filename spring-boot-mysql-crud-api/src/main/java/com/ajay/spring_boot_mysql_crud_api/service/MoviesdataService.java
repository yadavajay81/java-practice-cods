package com.ajay.spring_boot_mysql_crud_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ajay.spring_boot_mysql_crud_api.entity.Moviesdata;

@Service
public class MoviesdataService {
	
	//private final RestTemplate restTemplate = new RestTemplate();
	private final RestTemplate restTemplate;

	public MoviesdataService(RestTemplateBuilder builder) {
		super();
		this.restTemplate = builder.build();
	}
	
	public Moviesdata getMoviesdataByYear(int year) {
		String url = "https://jsonmock.hackerrank.com/api/moviesdata?Year="+year;
		
		return restTemplate.getForObject(url, Moviesdata.class);
		
	}
	
	

}

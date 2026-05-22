package com.ajay.spring_boot_mysql_crud_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.spring_boot_mysql_crud_api.entity.Moviesdata;
import com.ajay.spring_boot_mysql_crud_api.service.MoviesdataService;

@RestController
@RequestMapping("/api")
public class MoviesdataController {
	
	@Autowired
	private MoviesdataService moviesdataService;
	
	@GetMapping("/getmoviesdata")
	public Moviesdata getMoviesdata(
			@RequestParam(required = true, defaultValue="2015") int year) {
		return moviesdataService.getMoviesdataByYear(year);
	}
	
	@GetMapping("/getmoviesdata/{year}")
	public Moviesdata getMoviesdatan(
			@PathVariable("year") int year) {
		return moviesdataService.getMoviesdataByYear(year);
	}

}

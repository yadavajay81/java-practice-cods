package com.ajay.taskman.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.taskman.entities.Task;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	
	@GetMapping("/task")
	public ResponseEntity<String> fetchTask(@RequestParam(name="id") int id){
		
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	

}

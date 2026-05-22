package com.gradle.learning_gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping("/index")
	public String getIndex() {
		System.out.println("Gradel Project is running-1!");
		return "Gradel Project is running!";
	}

}

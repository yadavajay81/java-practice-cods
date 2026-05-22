package com.in28m.springboot.ajaylearnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28m.springboot.ajaylearnspringboot.bean.Students;

@RestController
public class StudentController {
	
	
	@RequestMapping("/student")
	public String index() {
		return "Student controller working.";
	}
	
	@RequestMapping("/getstudents")
	public List<Students> getAllStudents() {
		return Arrays.asList(
				new Students(1,"Ajay","MCA"),
				new Students(2,"Shreya", "4th")
				
				);
	}

}

package com.in28m.springboot.ajaylearnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28m.springboot.ajaylearnspringboot.bean.Course;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Java", "Ajay"),
				new Course(2, "Math", "Ajay2"),
				new Course(3, "Azure", "Ajay3")
				);
	}

}

package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/course")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "Ajay"),
				new Course(2, "Learn DevOps", "Ajay"),
				new Course(3, "Learn Azure", "Ajay"),
				new Course(4, "Learn ServiceNow", "Ajay")
				);
	}
	

}

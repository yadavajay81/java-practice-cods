package com.ajay.taskman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.ajay.taskman.entities.Student;

import service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService stds;
	
	@GetMapping
	private List<Student> findAll(){
		return stds.findAllStudent();
	}
	
	@GetMapping("/{id}")
	private Student findById(@PathVariable Long id) {
		return stds.findById(id); 
		
	}
	
	@DeleteMapping("/{id}")
	private void deleteById(@PathVariable Long id) {
		stds.deleteById(id);
		
	}
	
	@PostMapping
	private Student save(@RequestBody Student std) {
		return stds.saveStd(std);
		
	}
	
	@PutMapping("/{id}")
	private Student update(@PathVariable Long id, @RequestBody Student std) {
			
		return stds.updateStd(id, std);
		
	}

}

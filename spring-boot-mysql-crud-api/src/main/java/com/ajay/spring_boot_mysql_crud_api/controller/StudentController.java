package com.ajay.spring_boot_mysql_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.spring_boot_mysql_crud_api.entity.Student;
import com.ajay.spring_boot_mysql_crud_api.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> fetchStudentList(){
		return studentService.getStudentList();
		
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student ) {
		return studentService.saveStudent(student);
		
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@Valid @RequestBody Student student, 
			@PathVariable("id") Long studentId ) {
		
		return studentService.updateStudent(student, studentId);
		
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable Long studentId) {
		studentService.deleteStudent(studentId);
		return "Student deleted";
	}

}

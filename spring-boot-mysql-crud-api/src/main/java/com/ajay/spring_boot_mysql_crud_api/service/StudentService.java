package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;

import com.ajay.spring_boot_mysql_crud_api.entity.Student;

public interface StudentService {

	List<Student> getStudentList();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student, Long studentId);
	
	void deleteStudent(Long studentId);
	
	
}

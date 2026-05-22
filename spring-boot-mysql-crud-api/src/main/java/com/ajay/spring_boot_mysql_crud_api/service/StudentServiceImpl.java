package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.spring_boot_mysql_crud_api.entity.Student;
import com.ajay.spring_boot_mysql_crud_api.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getStudentList() {
		
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, Long studentId) {
		Student getFromDb = studentRepository.findById(studentId).get();
		if(Objects.nonNull(student.getStuduntName()) 
				&&!"".equalsIgnoreCase(student.getStuduntName())) {
			getFromDb.setStuduntName(student.getStuduntName());
			
		}
		
		if(Objects.nonNull(student.getStudentAddress())
				&& !"".equalsIgnoreCase(student.getStudentAddress())) {
			getFromDb.setStudentAddress(student.getStudentAddress());
		}

		return studentRepository.save(getFromDb);
	}

	@Override
	public void deleteStudent(Long studentId) {
		 studentRepository.deleteById(studentId);
		 
	}

}

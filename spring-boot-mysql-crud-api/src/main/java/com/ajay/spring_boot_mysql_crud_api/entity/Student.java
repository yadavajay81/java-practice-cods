package com.ajay.spring_boot_mysql_crud_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long studentId;
	
	private String studuntName;
	
	private String studentAddress;

	public String getStuduntName() {
		return studuntName;
	}

	public void setStuduntName(String studuntName) {
		this.studuntName = studuntName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	
	
	

}

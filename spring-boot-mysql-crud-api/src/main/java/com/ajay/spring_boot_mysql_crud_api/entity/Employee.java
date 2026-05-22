package com.ajay.spring_boot_mysql_crud_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeId;
	
	private String employeeName;
	
	private String epmloyeeAdress;

	

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEpmloyeeAdress() {
		return epmloyeeAdress;
	}

	public void setEpmloyeeAdress(String epmloyeeAdress) {
		this.epmloyeeAdress = epmloyeeAdress;
	}
	
	

}

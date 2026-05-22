package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;

import com.ajay.spring_boot_mysql_crud_api.entity.Employee;

public interface EmployeeService {
	
	List<Employee> fetchEmployeeList();
	
	Employee fetchEmployeeById(Long employeeId);
	
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee, Long employeeId);
	
	void deleteEmployee(Long employeeId);

}

package com.ajay.spring_boot_mysql_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.spring_boot_mysql_crud_api.entity.Employee;
import com.ajay.spring_boot_mysql_crud_api.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employeelist")
	public List<Employee> getEmployeeList(){
		return employeeService.fetchEmployeeList();
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeByID(@PathVariable("id") Long id) {
		return employeeService.fetchEmployeeById(id);
		
	}
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/updateemployee/{id}")
	public Employee updateEmployee(@Valid @RequestBody Employee employee,
			@PathVariable("id") Long employeeId) {
		return employeeService.updateEmployee(employee, employeeId);
		
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public String deleteEmployee(@PathVariable("id") Long employeeId) {
		employeeService.deleteEmployee(employeeId);
		return "Employee deleted.";
	}

}

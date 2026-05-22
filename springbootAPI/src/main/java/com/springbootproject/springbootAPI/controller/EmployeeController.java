package com.springbootproject.springbootAPI.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import com.springbootproject.springbootAPI.dto.EmployeeDTO;
import com.springbootproject.springbootAPI.entity.Employee;
import com.springbootproject.springbootAPI.service.EmployeeService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getEmployees(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {
		
		return ResponseEntity.ok(employeeService.getAllEmployees(page, size));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id){
		
		return ResponseEntity.ok(employeeService.getEmployeeById(null));
	}
	
	@PostMapping
	public ResponseEntity<EmployeeDTO> createEmployee(@Valid @RequestBody Employee employee){
		
		EmployeeDTO createdEmployee = employeeService.createEmployee(employee);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id, @Valid @RequestBody Employee employee){
		
		return ResponseEntity.ok(employeeService.updateEmployee(id, employee));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id){
		
		employeeService.deleteEmployee(id);
		
		return ResponseEntity.noContent().build();
		
	}

}

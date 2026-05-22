package com.springbootproject.springbootAPI.service;

import java.util.List;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.springbootproject.springbootAPI.dto.EmployeeDTO;
import com.springbootproject.springbootAPI.entity.Employee;
import com.springbootproject.springbootAPI.repository.EmployeeRepository;

import lombok.*;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public List<EmployeeDTO> getAllEmployees(int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		Page<Employee> employees = employeeRepository.findAll(pageable);
		return employees.map(this::convertToDTO).toList();
		
	}
	
	public EmployeeDTO getEmployeeById(Long id) {
		
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));
		return convertToDTO(employee);
		
	}
	
	public EmployeeDTO createEmployee(Employee employee) {
		
		Employee savedEmployee = employeeRepository.save(employee);
		return convertToDTO(savedEmployee);
		
	}
	
	public EmployeeDTO updateEmployee(Long id, Employee employeeDetail) {
		
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));
		
		employee.setName(employeeDetail.getName());
		employee.setAge(employeeDetail.getAge());
		employee.setDepartment(employeeDetail.getDepartment());
		
		return convertToDTO(employeeRepository.save(employee));		
		
	}
	
	public void deleteEmployee(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));
		
		employeeRepository.delete(employee);
	}
	
	private EmployeeDTO convertToDTO(Employee employee) {
		
		return EmployeeDTO.builder()
		.id(employee.getId())
		.name(employee.getName())
		.department(employee.getDepartment())
		.build();
		
	}

}

package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.spring_boot_mysql_crud_api.entity.Employee;
import com.ajay.spring_boot_mysql_crud_api.repository.EmployeeRepository;

@Service
@Transactional
public class EmpService {
	
	@Autowired
	private EmployeeRepository empR;
	
	public List<Employee> findAllEmployee(){
		return empR.findAll();
	}
	
	public Optional<Employee> findEmployeeById(Long id) {
		return empR.findById(id);
	}
	
	public Employee saveEmployee(Employee emp) {
		return empR.save(emp);
	}
	
	public Employee updateEmployee(Long id, Employee updatedEmp){
		return empR.findById(id).map(emp -> {
			emp.setEmployeeName(updatedEmp.getEmployeeName());
			emp.setEpmloyeeAdress(updatedEmp.getEpmloyeeAdress());
			return empR.save(emp);
		}).orElseThrow(()-> new RuntimeException("Employee not found!"));
	}
	
	public void deleteEmployee(Long id) {
		empR.deleteById(id);
	}

}

package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.spring_boot_mysql_crud_api.SimpleCache;
import com.ajay.spring_boot_mysql_crud_api.entity.Employee;
import com.ajay.spring_boot_mysql_crud_api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SimpleCache<String, Object> simpleCache;

	@Override
	public List<Employee> fetchEmployeeList() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, Long employeeId) {
		Employee fetchFromDb = employeeRepository.findById(employeeId).get();
		if(Objects.nonNull(employee.getEmployeeName())
				&&!"".equalsIgnoreCase(employee.getEmployeeName())) {
			fetchFromDb.setEmployeeName(employee.getEmployeeName());
		}
		
		if(Objects.nonNull(employee.getEpmloyeeAdress())
				&& !"".equalsIgnoreCase(employee.getEpmloyeeAdress())) {
			fetchFromDb.setEpmloyeeAdress(employee.getEpmloyeeAdress());
		}
		
		return employeeRepository.save(fetchFromDb);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	@Override
	public Employee fetchEmployeeById(Long employeeId) {
		String key = "employee:" + employeeId;
		if(simpleCache.containsKey(key)) {
			return (Employee) simpleCache.get(key);
		}else {
			Employee emp = employeeRepository.findById(employeeId).orElse(null);
			simpleCache.put(key, emp);
			return emp;
		}
		
		
	}

}

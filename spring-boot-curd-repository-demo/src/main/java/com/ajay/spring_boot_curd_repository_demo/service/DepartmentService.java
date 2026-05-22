package com.ajay.spring_boot_curd_repository_demo.service;

import java.util.List;

import com.ajay.spring_boot_curd_repository_demo.entity.Department;

//Class
public interface DepartmentService {

 // Save operation
 Department saveDepartment(Department department);

 // Read operation
 List<Department> fetchDepartmentList();

 // Update operation
 Department updateDepartment(Department department,
                             Long departmentId);

 // Delete operation
 void deleteDepartmentById(Long departmentId);
}

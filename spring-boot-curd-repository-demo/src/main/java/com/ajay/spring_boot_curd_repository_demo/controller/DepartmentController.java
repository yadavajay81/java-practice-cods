package com.ajay.spring_boot_curd_repository_demo.controller;

import java.util.List;
//Importing required classes
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ajay.spring_boot_curd_repository_demo.entity.Department;
import com.ajay.spring_boot_curd_repository_demo.service.DepartmentService;


@RestController
public class DepartmentController {

 @Autowired 
 private DepartmentService departmentService;

 
 @PostMapping("/departments")
 public Department saveDepartment(
     @Valid @RequestBody Department department)
 {
     return departmentService.saveDepartment(department);
 }

 
 @GetMapping("/departments")
 public List<Department> fetchDepartmentList()
 {
     return departmentService.fetchDepartmentList();
 }

 
 @PutMapping("/departments/{id}")
 public Department
 updateDepartment(@RequestBody Department department,
                  @PathVariable("id") Long departmentId)
 {
     return departmentService.updateDepartment(
         department, departmentId);
 }

 
 @DeleteMapping("/departments/{id}")
 public String deleteDepartmentById(@PathVariable("id")
                                    Long departmentId)
 {
     departmentService.deleteDepartmentById(
         departmentId);
     return "Deleted Successfully";
 }
}

package com.ajay.spring_boot_curd_repository_demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.spring_boot_curd_repository_demo.entity.Department;
 
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
     
}

package com.ajay.spring_boot_curd_repository_demo.entity;

import jakarta.persistence.Column;
//Importing required classes
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "department")

//Class
public class Department {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name="departmentId")
 private Long departmentId;
 
 @Column(name = "departmentName")
 private String departmentName;
 
 @Column(name = "departmentAddress")
 private String departmentAddress;
 
 @Column(name = "departmentCode")
 private String departmentCode;
}

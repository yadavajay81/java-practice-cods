package com.springbootproject.springbootAPI.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 65, message = "Age can not be more than 65")
	private int age;
	
	@NotBlank(message = "Department is required")
	private String department;

}

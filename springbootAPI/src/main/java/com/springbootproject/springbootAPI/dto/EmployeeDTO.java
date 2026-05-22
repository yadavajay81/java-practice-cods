package com.springbootproject.springbootAPI.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {
	
	private Long id;
	private String name;
	//private int age;
	private String department;

}

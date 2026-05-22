package com.ajay.spring_boot_mysql_crud_api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.ajay.spring_boot_mysql_crud_api.controller.EmployeeController;
import com.ajay.spring_boot_mysql_crud_api.entity.Employee;
import com.ajay.spring_boot_mysql_crud_api.service.EmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployee() throws Exception {
		Employee mockEmployee = new Employee(1L, "John Doe", "Maryland Heights");
		
		when(employeeService.fetchEmployeeById(1L)).thenReturn(mockEmployee);
		
		mockMvc.perform(get("/api/employee/1"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.employeeId").value(1))
			.andExpect(jsonPath("$.employeeName").value("John Doe"))
			.andExpect(jsonPath("$.epmloyeeAdress").value("Maryland Heights"));
		
	}

}

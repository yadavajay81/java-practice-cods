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

import com.ajay.spring_boot_mysql_crud_api.controller.WorkerController;
import com.ajay.spring_boot_mysql_crud_api.entity.Worker;
import com.ajay.spring_boot_mysql_crud_api.service.WorkerService;

@WebMvcTest(WorkerController.class)
public class WorkerControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	WorkerService workerService;
	
	@Test
	public void testGetWorker() throws Exception{
		
		Worker mockWorker = new Worker(1L, "Ben Joi", "Mo");
		
		when(workerService.FindWorkerById(1L)).thenReturn(mockWorker);
		
		
		mockMvc.perform(get("/worker/1"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.workerId").value(1))
			.andExpect(jsonPath("$.workerName").value("Ben Joi"))
			.andExpect(jsonPath("$.workerAddress").value("Mo"));
		
	}

}

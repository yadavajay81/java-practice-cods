package com.ajay.spring_boot_mysql_crud_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.spring_boot_mysql_crud_api.entity.Worker;
import com.ajay.spring_boot_mysql_crud_api.service.WorkerService;

import jakarta.validation.Valid;

@RestController
public class WorkerController {
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping("/workers")
	public List<Worker> fetchWorkerList(){
		return workerService.fetchWorkerList();
	}
	
	@GetMapping("/worker/{id}")
	public Worker fetchWorkerById(@PathVariable("id") Long id){
		return workerService.FindWorkerById(id);
	}
	
	@PostMapping("/workers")
	public Worker saveWorker(@Valid @RequestBody Worker worker) {
		return workerService.saveWorker(worker);
	}
	
	@PutMapping("worker/{id}")
	public Worker updateWorker(@Valid @RequestBody Worker worker,
			@PathVariable("id") Long workerId) {
		return workerService.updateWorker(worker, workerId);
	}
	
	@DeleteMapping("/worker/{id}")
	public String deleteWorkerById(@PathVariable("id") Long workerId) {
		workerService.deleteWorker(workerId);
		return "Delete Successfully!";
	}

}

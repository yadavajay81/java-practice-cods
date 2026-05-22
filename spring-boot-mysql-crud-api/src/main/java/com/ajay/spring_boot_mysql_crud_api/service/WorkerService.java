package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajay.spring_boot_mysql_crud_api.entity.Worker;

@Service
public interface WorkerService {
	
	//Save operation
	Worker saveWorker(Worker worker);
	
	Worker FindWorkerById(Long workerId);
	
	//Read Operation
	List<Worker> fetchWorkerList();
	
	//Update Operation
	Worker updateWorker(Worker worker, Long workerId);
	
	//Delete Operation
	void deleteWorker(Long workerId);

}

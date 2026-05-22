package com.ajay.spring_boot_mysql_crud_api.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.spring_boot_mysql_crud_api.entity.Worker;
import com.ajay.spring_boot_mysql_crud_api.exception.ResourceNotFoundException;
import com.ajay.spring_boot_mysql_crud_api.repository.WorkerRepository;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	WorkerRepository workerRepository;

	@Override
	public Worker saveWorker(Worker worker) {
		
		return workerRepository.save(worker);
	}

	@Override
	public List<Worker> fetchWorkerList() {
		
		return (List<Worker>) workerRepository.findAll();
	}

	@Override
	public Worker updateWorker(Worker worker, Long workerId) {
		
		Worker workerFromDb = workerRepository.findById(workerId).get();
		
		if(Objects.nonNull(worker.getWorkerName())
				&& !"".equalsIgnoreCase(worker.getWorkerName())) {
			
			workerFromDb.setWorkerName(worker.getWorkerName());
			
		}
		
		if(Objects.nonNull(worker.getWorkerAddress())
				&& !"".equalsIgnoreCase(worker.getWorkerAddress())) {
			workerFromDb.setWorkerAddress(worker.getWorkerAddress());
		}
		
		
		return workerRepository.save(workerFromDb);
	}

	@Override
	public void deleteWorker(Long workerId) {
		workerRepository.deleteById(workerId);
		
	}

	@Override
	public Worker FindWorkerById(Long workerId) {
		
		//return workerRepository.findById(workerId).orElse(null);
		return workerRepository.findById(workerId).orElseThrow(
				() -> new ResourceNotFoundException("Worker not found with ID: "+workerId));
	}
	
	

}

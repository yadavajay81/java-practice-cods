package com.ajay.spring_boot_mysql_crud_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long workerId;
	private String workerName;
	private String workerAddress;
	
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getWorkerAddress() {
		return workerAddress;
	}
	public void setWorkerAddress(String workerAddress) {
		this.workerAddress = workerAddress;
	}
	
	

}

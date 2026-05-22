package com.string.dependency.injection.string_dependency_injection.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	@Value("${dependency.injection.throughValue}")
	private String message;

	
	public void printMessage() {
		System.out.println(message);
	}
	
	

}

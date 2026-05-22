package com.string.dependency.injection.string_dependency_injection.service;

import org.springframework.stereotype.Component;

@Component
public class MyServiceBean {
	
	private String beanMessage;
	
	public MyServiceBean(String beanMessage) {
		this.beanMessage = beanMessage;
	}
	
	public void printMyServiceBean() {
		System.out.println(beanMessage);
	}

}

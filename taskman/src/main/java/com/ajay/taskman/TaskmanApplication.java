package com.ajay.taskman;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanApplication {
	
	@Value("${str1:Ajay}")
	private static String str1;

	public static void main(String[] args) {
		System.out.println(str1);
		System.exit(0);
		SpringApplication.run(TaskmanApplication.class, args);
	}

}

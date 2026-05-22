package com.luv2code.springbootlibrary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLibraryApplication {
	
	private static final Logger log = LogManager.getLogger(SpringBootLibraryApplication.class);

	public static void main(String[] args) {
		log.info("Log the text");
		SpringApplication.run(SpringBootLibraryApplication.class, args);
	}

}

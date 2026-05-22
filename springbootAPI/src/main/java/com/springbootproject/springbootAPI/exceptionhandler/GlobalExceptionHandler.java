package com.springbootproject.springbootAPI.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	public ResponseEntity<Map<String, String>> handleNotFound(RuntimeException ex){
		
		Map<String, String> err = new HashMap<>();
		
		err.put("error", ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}

}

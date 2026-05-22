package com.in28minutes.springboot.in28minutesdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String helloGFG() {
		return "Hello GFG whats up";
	}

}

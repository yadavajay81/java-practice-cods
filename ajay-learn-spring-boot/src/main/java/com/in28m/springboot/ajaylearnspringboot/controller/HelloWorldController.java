package com.in28m.springboot.ajaylearnspringboot.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28m.springboot.ajaylearnspringboot.bean.HelloWorldBean;
import com.in28m.springboot.ajaylearnspringboot.service.CurrencyConfigurationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloWorldController {
	
	 private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	private MessageSource messageSource;
	
	
	
	
	public HelloWorldController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}


	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		logger.info("Hello World");
		CurrencyConfigurationService currencyConfigurationService = new CurrencyConfigurationService();
		currencyConfigurationService.getUsername();
		return currencyConfigurationService.getUsername();
	}
	
	
	@GetMapping(path="/hello-world-internationalize")
	public String helloWorldInternationalize() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		
		//return "Hello World h2";
	}
	

	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	//path-variable
	//@PathVariable
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(
				String.format("Hello World  %s", name));
	}
	
	@GetMapping(path="/hello-world/path-variable/fname/{fname}/lname/{lname}")
	public HelloWorldBean helloWorldMultiPathVariable(@PathVariable String fname, @PathVariable String lname) {
		return new HelloWorldBean(
				String.format("Hello World  %s %s", fname, lname));
	}
	
}

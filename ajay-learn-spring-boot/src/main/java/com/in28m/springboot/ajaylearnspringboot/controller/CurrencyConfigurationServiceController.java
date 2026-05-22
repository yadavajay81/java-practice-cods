package com.in28m.springboot.ajaylearnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28m.springboot.ajaylearnspringboot.service.CurrencyConfigurationService;

@RestController
public class CurrencyConfigurationServiceController {
	
	@Autowired
	CurrencyConfigurationService configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyConfigurationService retriveCurrencyConfiguration() {
		return configuration;
	}

}

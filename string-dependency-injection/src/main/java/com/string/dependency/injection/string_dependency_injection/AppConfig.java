package com.string.dependency.injection.string_dependency_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer{
	
	@Value("${dependency.injection.throughValue}")
	private String message;
	
	@Bean
	public String myString() {
		return "Injected String from @Bean "+message;
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("http://example.com")
		.allowedMethods("GET", "POST", "PUT", "DELETE");
		
	}

}

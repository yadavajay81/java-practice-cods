package com.string.dependency.injection.string_dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.string.dependency.injection.string_dependency_injection.service.MyService;
import com.string.dependency.injection.string_dependency_injection.service.MyServiceBean;

@SpringBootApplication
public class StringDependencyInjectionApplication {
	
	

	public static void main(String[] args) {	
		AppConfig appConfig = new AppConfig();
		System.out.println(appConfig.myString());
		
		ApplicationContext context = SpringApplication.run(StringDependencyInjectionApplication.class, args);
		
		MyService myService = context.getBean(MyService.class);
		myService.printMessage();
		
		MyServiceBean myServiceBean = context.getBean(MyServiceBean.class);
		myServiceBean.printMyServiceBean();
		
	}

}

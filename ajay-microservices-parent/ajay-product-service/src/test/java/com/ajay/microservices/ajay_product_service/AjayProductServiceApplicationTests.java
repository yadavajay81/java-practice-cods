package com.ajay.microservices.ajay_product_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.Container;

@SpringBootTest
@Testcontainers
class AjayProductServiceApplicationTests {
	
	//@Container
	//static MySQLContainer<?> mysqlOldVersion = new MySQLContainer<>(MySQLTestImages.MYSQL_80_IMAGE);

	@Test
	void contextLoads() {
	}

}

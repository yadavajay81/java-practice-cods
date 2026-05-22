package com.schedular.cronejobondemand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Scheduled(fixedRate = 10000)
 * @Scheduled(cron = "0 44 5 * * *")
 */

@SpringBootApplication
@EnableScheduling
public class CronejobondemandApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CronejobondemandApplication.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	boolean runAtOnce = false;

	@Autowired
	ProcessDataHere processDataHere;

	public static void main(String[] args) {
		SpringApplication.run(CronejobondemandApplication.class, args);

	}

	@Scheduled(cron = "0 31 5 * * *")
	public void reportCurrentTime() {
		
		log.info("From scheduler The time is now {}", dateFormat.format(new Date()));
		processDataHere.processHere();
	}

	public void reportCurrentTime1() {
		
		log.info("Run Att once Without Schudle The time is now {}", dateFormat.format(new Date()));
		processDataHere.processHere();
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Application Started");
		if (runAtOnce) {
			reportCurrentTime1();
		}

	}

}

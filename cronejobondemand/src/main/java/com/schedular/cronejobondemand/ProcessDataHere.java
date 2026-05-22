package com.schedular.cronejobondemand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProcessDataHere {
	
	private static final Logger log = LoggerFactory.getLogger(ProcessDataHere.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	public void processHere() {
		log.info("From ProcessDataHere The time is now {}", dateFormat.format(new Date()));
	}

}

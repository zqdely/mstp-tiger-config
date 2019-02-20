package com.kanshu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class StartApplication {
	
	 private static Logger logger = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		
		logger.info("进入zuul网关。。。");
		
		SpringApplication.run(StartApplication.class, args);
	}
	
}


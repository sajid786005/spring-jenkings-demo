package com.example.Jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkingsDemoApplication {
	
	
	
	public static Logger logger= LoggerFactory.getLogger(SpringJenkingsDemoApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application exeuted...");
		SpringApplication.run(SpringJenkingsDemoApplication.class, args);
	}

}

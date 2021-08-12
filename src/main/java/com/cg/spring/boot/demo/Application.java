package com.cg.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Vaman Deshmukh
 * 
 *         Spring boot demo project for CG trainees June 2021
 *         code updated. 
 *
 */
@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(Application.class, args);
		LOG.info("End");
	}
}

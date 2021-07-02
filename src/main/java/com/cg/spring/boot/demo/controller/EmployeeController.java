package com.cg.spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.model.Employee;

@RestController
public class EmployeeController {

	public static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping("/emp")
	public Employee getEmployee() {
		LOG.info("emp");
		return new Employee(101, "Sonu", 10.50);
	}

}

package com.cg.spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.model.Employee;
import com.cg.spring.boot.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	public static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService service;

	@RequestMapping("/emp")
	public Employee getEmployee() {
		LOG.info("emp");
//		return new Employee(101, "Sonu", 10.50);
		return service.findEmployeeById(101);

	}

	@RequestMapping("/getemp")
	public Employee getEmployeeById(int eid) {
		LOG.info("empemp");
		return service.findEmployeeById(eid);
	}

}

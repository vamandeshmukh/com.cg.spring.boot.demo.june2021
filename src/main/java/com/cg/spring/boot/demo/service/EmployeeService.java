package com.cg.spring.boot.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.demo.model.Employee;
import com.cg.spring.boot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	public static final Logger LOG = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	EmployeeRepository repository;

	public Employee findEmployeeById(int eid) {
		LOG.info("getEmployeeById");
		return repository.findById(eid).get();
	}

}

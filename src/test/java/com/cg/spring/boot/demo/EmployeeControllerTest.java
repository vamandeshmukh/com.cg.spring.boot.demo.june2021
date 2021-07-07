package com.cg.spring.boot.demo;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.spring.boot.demo.service.EmployeeService;

@SpringBootTest
public class EmployeeControllerTest {

	private static Logger LOG = LoggerFactory.getLogger(EmployeeControllerTest.class);

	@MockBean
	private EmployeeService employeeService;

	@Test
	public void testFindEmployeeById() throws Exception {

		LOG.info("testFindEmployeeById");

//		assertEquals(expected, actual);
	}

}
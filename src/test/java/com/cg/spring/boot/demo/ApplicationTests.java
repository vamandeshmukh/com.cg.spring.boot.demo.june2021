package com.cg.spring.boot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	private static Logger LOG = LoggerFactory.getLogger(ApplicationTests.class);

	@Test
	void testHello() {
		LOG.info("testHello");
		Hello obj = new Hello();
		String expected = obj.hello();
		String actual = "Hello world!";
		LOG.info(expected);
		LOG.info(actual);
		assertEquals(expected, actual);
	}
}

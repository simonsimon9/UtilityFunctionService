package com.simonkuang.utilityfunctionservice;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilityfunctionserviceApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(UUID.randomUUID());
	}

}

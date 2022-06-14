package com.simonkuang.utilityfunctionservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.simonkuang.utilityfunctionservice.models.Calculator;
import com.simonkuang.utilityfunctionservice.repo.CalculatorRepo;


import reactor.core.publisher.Mono;

@SpringBootTest
class UtilityfunctionserviceApplicationTests {
	@Autowired
	CalculatorRepo repo;
	@Test
	void contextLoads() {
		//find by id , nothing happens must sub
		Mono<Calculator> findByIdMono = repo.findById("3");
		// use block to subscribe 
		System.out.println(findByIdMono);
		final Calculator findByIdCalculator = findByIdMono.block();
		System.out.println("test");
		System.out.println(findByIdCalculator.getCalc());
		
	//	System.out.println("HI---------------");
		
	}

}

package com.simonkuang.utilityfunctionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.cosmos.models.PartitionKey;

import com.simonkuang.utilityfunctionservice.models.Calculator;
import com.simonkuang.utilityfunctionservice.repo.CalculatorRepo;
import com.simonkuang.utilityfunctionservice.repo.UrlRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CalculatorService {
	private CalculatorRepo calculatorRepo;
	
	@Autowired
	public CalculatorService(CalculatorRepo calculatorRepo) {
		this.calculatorRepo = calculatorRepo;
	}
	
	public Mono<Calculator> findCalc() {
		
	    Mono<Calculator> retrievedCalc = calculatorRepo.findById("1", new PartitionKey("3+3"));
		
	    return retrievedCalc;
	}
	
}

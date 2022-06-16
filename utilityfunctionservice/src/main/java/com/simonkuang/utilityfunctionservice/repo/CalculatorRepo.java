package com.simonkuang.utilityfunctionservice.repo;

import org.springframework.stereotype.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.simonkuang.utilityfunctionservice.models.Calculator;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CalculatorRepo extends ReactiveCosmosRepository<Calculator, String> {
	Flux<Calculator> findByCalc(String calc);
}

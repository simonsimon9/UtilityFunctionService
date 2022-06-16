package com.simonkuang.utilityfunctionservice.service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.cosmos.models.PartitionKey;

import com.simonkuang.utilityfunctionservice.models.Calculator;
import com.simonkuang.utilityfunctionservice.repo.CalculatorRepo;
import com.simonkuang.utilityfunctionservice.repo.UrlRepo;
import com.udojava.evalex.Expression;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class CalculatorService {
	private CalculatorRepo calculatorRepo;
	
	@Autowired
	public CalculatorService(CalculatorRepo calculatorRepo) {
		this.calculatorRepo = calculatorRepo;
	}
	public String saveCalc(String calc, String answer) {
		final Calculator calculator = new Calculator( calc, answer, "user");
		final Mono<Calculator> saveCalculatorMono = calculatorRepo.save(calculator);
		final Calculator savedCalculator = saveCalculatorMono.block();
		System.out.println(savedCalculator.getCalc());
		return "saved";
	}
	public String findCalc(String calc) {
		
	    Flux<Calculator> findByCalcMono = calculatorRepo.findByCalc(calc);
		List<Calculator> found = findByCalcMono.collectList().block();
		if(found.isEmpty()) {
			
			return "none";
		}else {
			return found.get(0).getAnswer();
		}
	    
	}
	
	public String calculate(String calculation) {
		String operators[] = calculation.split("\\d*\\.?\\d+");//this retrieves the operators
		String operands[]=calculation.split("[\\+\\-\\*\\/]"); //this retrieves the numbers
		try {
			if(calculation.substring(calculation.length()-1).equals("+") ||
					calculation.substring(calculation.length()-1).equals("-")||
					calculation.substring(calculation.length()-1).equals("/")||
					calculation.substring(calculation.length()-1).equals("*")) {
				
				return "Invalid";
			}else {
				double aggregate = Double.parseDouble(operands[0]);
				for(int i=1; i<operands.length;i++) {
					if(operators[i].equals("+")) {
						aggregate += Double.parseDouble(operands[i]);
					}else if(operators[i].equals("-")) {
						aggregate -= Double.parseDouble(operands[i]);
					}else if(operators[i].equals("/")) {
						aggregate /= Double.parseDouble(operands[i]);
						
					}else if(operators[i].equals("*")) {
						aggregate *= Double.parseDouble(operands[i]);
					}
				}
					DecimalFormat format = new DecimalFormat("0.#####");
					return String.valueOf(format.format(aggregate));
				
			}
			
		}catch(NumberFormatException | ArrayIndexOutOfBoundsException  e) {
			e.printStackTrace();
			return "Invalid Result";
		}
		
	}
	
}

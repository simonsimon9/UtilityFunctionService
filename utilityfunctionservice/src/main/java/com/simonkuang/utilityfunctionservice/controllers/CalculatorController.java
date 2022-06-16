package com.simonkuang.utilityfunctionservice.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udojava.evalex.Expression;

//import com.simonkuang.utilityfunctionservice.service.CalculatorService;

@RestController
public class CalculatorController {
	//@Autowired
	//private CalculatorService calculatorService;
	
	@PostMapping(value="/calc")
	@CrossOrigin
	public void getPage(@RequestBody String calculation) {
		//System.out.println(calculatorService.findCalc());
		//return email.matches("[A-Za-z]+[A-Za-z0-9_.-]+[@][A-Za-z]+[A-Za-z0-9_.-]+[.](com|org|net)");
		
		if(calculation.matches("^\\d{3}")) {
			System.out.println(calculation);
			BigDecimal e = new Expression(calculation).setPrecision(4).eval();
			System.out.println(e);
		}

		System.out.println("invalid");
	}
}

package com.simonkuang.utilityfunctionservice.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.service.CalculatorService;
import com.udojava.evalex.Expression;

//import com.simonkuang.utilityfunctionservice.service.CalculatorService;

@RestController
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping(value="/calc")
	@CrossOrigin
	public ResponseEntity<String> getPage(@RequestBody String calculation) {
		String answer = calculatorService.calculate(calculation);
		System.out.println(answer);
		return new ResponseEntity<>(answer, HttpStatus.OK);
	}
}

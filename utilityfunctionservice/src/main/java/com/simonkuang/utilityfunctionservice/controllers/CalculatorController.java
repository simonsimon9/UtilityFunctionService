package com.simonkuang.utilityfunctionservice.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.models.Calculator;
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
		String findAnswerInAzureDB = calculatorService.findCalc(calculation);
		String answer;
		if(findAnswerInAzureDB == "none") {
			answer = calculatorService.calculate(calculation);
			calculatorService.saveCalc(calculation,answer);
			System.out.println("Not found in Azure, calculating and saving to Azure");
			return new ResponseEntity<>(answer, HttpStatus.OK);
		}else {
			System.out.println("Found this from Azure DB");
			return new ResponseEntity<>(findAnswerInAzureDB, HttpStatus.OK);
		}
		
		
		
	}
}

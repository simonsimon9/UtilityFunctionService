package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.simonkuang.utilityfunctionservice.service.CalculatorService;


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

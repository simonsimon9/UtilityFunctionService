package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.simonkuang.utilityfunctionservice.service.CalculatorService;

@RestController
public class CalculatorController {
	//@Autowired
	//private CalculatorService calculatorService;
	
	@GetMapping(value="/cal")
	public String getPage() {
		//System.out.println(calculatorService.findCalc());
		return "welcome";
		
	}
}

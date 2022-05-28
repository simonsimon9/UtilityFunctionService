package com.simonkuang.utilityfunctionservice.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class HomePageController {
	@GetMapping(value="/")
	public String homePage() {
		log.info("in default");
		return "sup man";
	}
	@GetMapping(value="/s")
	public String hey() {
		log.info("in the method");
		return "hey";
	}
	

	
}

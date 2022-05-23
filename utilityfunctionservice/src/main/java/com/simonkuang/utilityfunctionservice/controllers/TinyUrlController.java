package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class TinyUrlController {
	

	@GetMapping(value = "/test")
	public String main() {
		log.info("test tiny controller");
		return "test";
	}
}

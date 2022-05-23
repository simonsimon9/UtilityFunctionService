package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.service.UrlService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class TinyUrlController {
	@Autowired
	private UrlService urlservice;

	@GetMapping(value = "/test")
	public String main() {
		log.info("test tiny controller");
		return "test";
	}
}

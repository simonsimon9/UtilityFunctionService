package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.models.Url;
import com.simonkuang.utilityfunctionservice.service.UrlService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping(value = "/tinyurl")
@CrossOrigin
public class TinyUrlController {
	@Autowired
	private UrlService urlservice;

	@GetMapping(value = "/test")
	public String main() {
		log.info("test tiny controller");
		return "test";
	}
	
	@PostMapping(value= "/post")
	@ResponseBody
	public Url recieveUrl(@RequestBody Url url) {
		log.info("recieved");
		return new Url(url.getOriginalurl(), "random");
	}
}

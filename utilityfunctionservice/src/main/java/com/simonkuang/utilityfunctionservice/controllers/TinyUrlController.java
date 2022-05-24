package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

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

	
	
	@PostMapping(value= "/post")
	@ResponseBody
	public Url recieveUrl(@RequestBody Url url) {
		log.info("recieved");
	
		Url newUrl = urlservice.addUrl(url);
		return new Url(newUrl.getOriginalurl(), newUrl.getTinyurl());
	}
	
	@GetMapping(value="/{id}")
	public RedirectView requestUrl(@PathVariable("id") Long id) {
		log.info("Retrieved original url from DB, returning");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(urlservice.obtainUrl(id));
		return redirectView;
	}
	
	
}
/*
@GetMapping(value="/{id}")
public String requestUrl(@PathVariable("id") Long id) {
	System.out.println(urlservice.obtainUrl(id).getOriginalurl());
	return urlservice.obtainUrl(id).getOriginalurl();
}
*/

package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class HomePageController {
	@GetMapping(value="/")
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dist/frontend/index.html");
		//modelAndView.setViewName("tiny/view.html");
		return modelAndView;
	}
	@GetMapping(value="/s")
	public String hey() {
		log.info("in the method");
		return "hey";
	}
}

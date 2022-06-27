package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.prominence.openweathermap.api.OpenWeatherMapClient;
import com.github.prominence.openweathermap.api.model.weather.Weather;
import com.simonkuang.utilityfunctionservice.config.WeatherProperties;
import com.simonkuang.utilityfunctionservice.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService weatherService;

 //We will also want to vend a service so our customers 
 //can know the weather based on a zipcode and display it on the frontend.
	@GetMapping(value="/weather")
	public String getWeather() {
	//	log.info("in the method");
		Weather getWeatherByZip =weatherService.weatherByZip("48210");
		System.out.println(getWeatherByZip.getTemperature());
		System.out.println(getWeatherByZip.getLocation());
		return "test weather";
	}
	
}

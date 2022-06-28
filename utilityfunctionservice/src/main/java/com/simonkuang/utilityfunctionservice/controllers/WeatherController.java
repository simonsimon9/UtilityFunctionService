package com.simonkuang.utilityfunctionservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.prominence.openweathermap.api.OpenWeatherMapClient;
import com.github.prominence.openweathermap.api.model.forecast.Forecast;
import com.github.prominence.openweathermap.api.model.weather.Weather;
import com.simonkuang.utilityfunctionservice.config.WeatherProperties;
import com.simonkuang.utilityfunctionservice.service.WeatherService;

@RestController
public class WeatherController {
	@Autowired
	WeatherProperties weatherykey;
	@Autowired
	WeatherService weatherService;

 //We will also want to vend a service so our customers 
 //can know the weather based on a zipcode and display it on the frontend.
	
//http://localhost:8080/weather?zip=90001
	@CrossOrigin
	@GetMapping(value="/weather")
	public ResponseEntity<Weather> getWeather(@RequestParam String zip) {
	//	log.info("in the method");
		//need try catch 
		Weather getWeatherByZip = weatherService.weatherByZip(zip);
		return new ResponseEntity<Weather>(getWeatherByZip, HttpStatus.OK);
	}
	//http://localhost:8080/forecast?zip=90001
	@CrossOrigin
	@GetMapping(value="/forecast")
	public ResponseEntity<Forecast> getForecast(@RequestParam String zip) {
	//	log.info("in the method");
		//need try catch 
		Forecast getForecastByZip = weatherService.forecastByZip(zip);
		return new ResponseEntity<Forecast>(getForecastByZip, HttpStatus.OK);
	}
	
}

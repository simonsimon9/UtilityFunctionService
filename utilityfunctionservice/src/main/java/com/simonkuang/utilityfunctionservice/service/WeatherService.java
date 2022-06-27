package com.simonkuang.utilityfunctionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.prominence.openweathermap.api.OpenWeatherMapClient;
import com.github.prominence.openweathermap.api.enums.Language;
import com.github.prominence.openweathermap.api.enums.UnitSystem;
import com.github.prominence.openweathermap.api.model.weather.Weather;
import com.simonkuang.utilityfunctionservice.config.WeatherProperties;
@Service
public class WeatherService {
	
	
	private OpenWeatherMapClient openWeatherClient;
	WeatherService(){
		openWeatherClient = new OpenWeatherMapClient("5ab7c97d141c27cda9a7a80c879f718b");
	}
	
	
	public Weather weatherByZip(String zipcode) {
		
		Weather weatherResponse = 
				openWeatherClient
				.currentWeather()
				.single()
				.byZipCodeInUSA(zipcode)
				.language(Language.ENGLISH)
				.unitSystem(UnitSystem.METRIC)
				.retrieve()
				.asJava();
		
		return weatherResponse;
	}
	
	
}

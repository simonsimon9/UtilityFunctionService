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
	@Autowired
	private WeatherProperties weatherProperty;
	private OpenWeatherMapClient openWeatherClient;
	
	
	
	public Weather weatherByZip(String zipcode) {
		openWeatherClient = new OpenWeatherMapClient(weatherProperty.getKey());
		
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

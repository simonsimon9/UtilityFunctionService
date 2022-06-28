package com.simonkuang.utilityfunctionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.github.prominence.openweathermap.api.OpenWeatherMapClient;
import com.github.prominence.openweathermap.api.enums.Language;
import com.github.prominence.openweathermap.api.enums.UnitSystem;
import com.github.prominence.openweathermap.api.model.forecast.Forecast;
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
				.unitSystem(UnitSystem.IMPERIAL)
				.retrieve()
				.asJava();
		System.out.println(weatherResponse.getRain());
		return weatherResponse;
	}
	
	public Forecast forecastByZip(String zipcode) {
		openWeatherClient = new OpenWeatherMapClient(weatherProperty.getKey());

		Forecast forecast = openWeatherClient
				.forecast5Day3HourStep()
				.byZipCodeInUSA(zipcode)
				.unitSystem(UnitSystem.IMPERIAL)
				.count(15)
				.retrieve()
				.asJava();
		
		return forecast;
	}
	
	
}

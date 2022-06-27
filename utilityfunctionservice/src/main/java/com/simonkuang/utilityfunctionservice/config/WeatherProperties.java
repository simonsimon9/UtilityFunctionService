package com.simonkuang.utilityfunctionservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan 
@ConfigurationProperties(prefix = "weather")
public class WeatherProperties {

    private String key;
   
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
   
}

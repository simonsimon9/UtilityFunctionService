package com.simonkuang.utilityfunctionservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConfigurationPropertiesScan 
@ConfigurationProperties(prefix = "spring.cloud.azure.cosmos")
public class ConfigProperties {

    private String endpoint;
    
   
    public String getEndpoint() {
    	return endpoint;
    }
    public void setEndpoint(String endpoint) {
    	this.endpoint=endpoint;
    }
   
}
/*
@Autowired
private Environment env;

private String weatherKey;
//private OpenWeatherMapClient openWeatherClient = new OpenWeatherMapClient();



public String getWeatherKey() {
	return env.getProperty("weather.key");
}*/
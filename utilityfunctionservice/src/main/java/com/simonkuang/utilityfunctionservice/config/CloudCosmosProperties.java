package com.simonkuang.utilityfunctionservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@ConfigurationPropertiesScan 
@ConfigurationProperties(prefix = "spring.cloud.azure.cosmos")
public class CloudCosmosProperties {

    private String endpoint;
    private String key;
   
    public String getEndpoint() {
    	return endpoint;
    }
    public void setEndpoint(String endpoint) {
    	this.endpoint=endpoint;
    }
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
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
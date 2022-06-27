package com.simonkuang.utilityfunctionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.config.PropertiesLoader;

@EnableConfigurationProperties(PropertiesLoader.class)
@RestController 
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class UtilityfunctionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityfunctionserviceApplication.class, args);
	}
	
	
}

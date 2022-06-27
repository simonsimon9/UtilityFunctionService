package com.simonkuang.utilityfunctionservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simonkuang.utilityfunctionservice.config.CloudCosmosProperties;
import com.simonkuang.utilityfunctionservice.config.PropertiesLoader;
import com.simonkuang.utilityfunctionservice.config.WeatherProperties;
import com.simonkuang.utilityfunctionservice.models.User;
import com.simonkuang.utilityfunctionservice.service.UserService;
@RestController
public class UserController {
	@Autowired //handles depedency injection for repo. 
	private UserService userService;
	@Autowired
	private CloudCosmosProperties hi;
	@Autowired
	private WeatherProperties weather;
	
	@GetMapping(value="/user")
	public String getPage() {
	
		
		return "hahahahah";
		
	}
	@GetMapping(value="users")
	public List<User> getUsers() {
		return userService.findUsers();
	}
	
	@PostMapping(value="/save")
	public String saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return "Saved...";
		
	}
	
	@PutMapping(value="/update/{id}")
	public String updateUser(@PathVariable long id, @RequestBody User user) {
		userService.putUser(id,user);
		return "Updated...";
		
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		userService.deleteUser(id);
		return "User deleted..." + id;
	}
}

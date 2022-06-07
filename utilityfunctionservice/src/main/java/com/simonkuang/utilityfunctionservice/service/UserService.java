package com.simonkuang.utilityfunctionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonkuang.utilityfunctionservice.models.User;
import com.simonkuang.utilityfunctionservice.repo.UrlRepo;
import com.simonkuang.utilityfunctionservice.repo.UserRepo;

@Service
public class UserService { //handles the business logic , how the data is handled from front end to database to be saved. /filtered etc. 
	
	private UserRepo userRepo;
	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public List<User> findUsers() {
		return userRepo.findAll();
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		 userRepo.save(user);
	}

	public void putUser(long id, User user) {
		User updatedUser = userRepo.findById(id).get();
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setOccupation(user.getOccupation());
		updatedUser.setAge(user.getAge());
		userRepo.save(updatedUser);
	}

	public void deleteUser(long id) {
		User deleteUser = userRepo.findById(id).get();
		userRepo.delete(deleteUser);
	}


	
	
	
}

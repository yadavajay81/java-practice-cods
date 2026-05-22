package com.springbootproject.springbootAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.springbootAPI.entity.User;
import com.springbootproject.springbootAPI.repository.UserRespository;



@Service
public class UserService {
	
	@Autowired
	private UserRespository userRespository;
	
	public User createUser(User user) {
		
		return userRespository.save(user);
		
	}
	
	public List<User> getAllUsers(){
		return userRespository.findAll();
	}
	
	public User getUserById(Long id) {
		
		return userRespository.findById(id)
				.orElseThrow(() -> new RuntimeException("User Not found"));
		
	}
	
	public User updateUser(Long id, User user) {
		user.setId(id);
		return userRespository.save(user);
	}
	
	public void deleteUserById(Long id) {
		userRespository.deleteById(id);
	}

}

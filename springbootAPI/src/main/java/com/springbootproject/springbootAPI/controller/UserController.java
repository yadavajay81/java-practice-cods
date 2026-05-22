package com.springbootproject.springbootAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.springbootAPI.entity.User;
import com.springbootproject.springbootAPI.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public User createuser(@RequestBody User user) {
		
		return userService.createUser(user);
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		
		return userService.getUserById(id);
	}
	
	@PutMapping("/{id}")
	public User updateUserById(@PathVariable Long id, @RequestBody User user) {
		
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable Long id) {
		
		userService.deleteUserById(id);
	}
	
}

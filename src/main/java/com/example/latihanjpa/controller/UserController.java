package com.example.latihanjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.latihanjpa.entity.User;
import com.example.latihanjpa.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User users) {
		return userService.saveUser(users);
		
	}
	
	@GetMapping("/getByUserId/{id}")
	public User getById(@PathVariable int id) {
		return userService.getUserId(id);
		
	}
	
	@GetMapping("/getUserAddress/{user_address}")
	public List<User> getUserAddress(@PathVariable List<String> user_address) {
		return userService.getUserByAddress(user_address);
		
	}

}

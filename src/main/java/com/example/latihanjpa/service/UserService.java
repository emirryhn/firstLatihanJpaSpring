package com.example.latihanjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.latihanjpa.entity.User;
import com.example.latihanjpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User users) {
		return userRepository.save(users);
	}
	
	public User getUserId(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> getUserByAddress(List<String> user_address){
		return userRepository.findAddress(user_address);
		
	}
}

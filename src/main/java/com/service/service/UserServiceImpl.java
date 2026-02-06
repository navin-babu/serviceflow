package com.service.service;

import org.springframework.stereotype.Service;
import com.service.model.User;
import com.service.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User authenticateLogin(String username, String password) {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		if (!user.getPassword().equals(password) || !user.getUsername().equals(username)) {
			throw new RuntimeException("Invalid Username or Password");
		}
		return user;
	}
}

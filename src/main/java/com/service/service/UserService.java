package com.service.service;

import com.service.model.User;

public interface UserService {
	
	public User authenticateLogin(String username, String password);

}

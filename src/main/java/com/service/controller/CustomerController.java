package com.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.service.UserService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	private final UserService userService;
	
	public CustomerController(UserService userService) {
		this.userService = userService;
	}
}
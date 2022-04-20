package com.pc.collabtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.collabtest.model.LoginCredentials;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserService userService;
	
	@Override
	public void validateLogin(LoginCredentials credentials) {
		userService.isValidCredentials(credentials);
		
	}

}

package com.pc.collabtest.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.collabtest.model.LoginCredentials;
import com.pc.collabtest.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginAction {

	
	@Autowired
	private LoginService loginService;
	
	public String login() throws Exception {
		
		//loginService.validateLogin(credentials);
		
		return "success";
	}
}

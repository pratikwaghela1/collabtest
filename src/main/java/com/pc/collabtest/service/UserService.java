package com.pc.collabtest.service;

import java.util.List;

import com.pc.collabtest.model.LoginCredentials;
import com.pc.collabtest.model.User;

public interface UserService {
	public List<User> getAllUsers() throws Exception;
	
	public boolean isValidCredentials(LoginCredentials credentials);
}

package com.pc.collabtest.service;

import java.util.List;

import com.pc.collabtest.model.LoginCredentials;
import com.pc.collabtest.model.User;

public interface UserService {
	List<User> getAllUsers() throws Exception;
	
	boolean isValidCredentials(LoginCredentials credentials);

	User saveUser(User user);
}

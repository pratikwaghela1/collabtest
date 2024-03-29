package com.pc.collabtest.service;

import java.util.List;

import com.pc.collabtest.dto.UserDto;
import com.pc.collabtest.model.Login;
import com.pc.collabtest.model.User;

public interface UserService {
	List<UserDto> getAllUsers() throws Exception;
	
	User isValidUserCredentials(Login credentials);

	User saveUser(UserDto user);
}

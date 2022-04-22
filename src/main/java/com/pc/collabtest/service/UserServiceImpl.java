package com.pc.collabtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.collabtest.model.LoginCredentials;
import com.pc.collabtest.model.User;
import com.pc.collabtest.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() throws Exception {
		List<User> users =  userRepository.findAll();
		log.info("users :: "+ users);
		return users;
	}

	@Override
	public boolean isValidCredentials(LoginCredentials credentials) {
		return false;
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
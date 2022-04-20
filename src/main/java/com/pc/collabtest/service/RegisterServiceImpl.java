package com.pc.collabtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.collabtest.model.User;
import com.pc.collabtest.repository.UserRepository;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService{

	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User registerUser(User user) {
		return userRepository.save(user);
	}

}

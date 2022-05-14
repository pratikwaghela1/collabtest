package com.pc.collabtest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.collabtest.model.Login;
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
		List<User> users = userRepository.findAll();
		log.info("users :: " + users);
		return users;
	}

	@Override
	public User isValidUserCredentials(Login login) {

		Optional<User> user = userRepository.findByUserNameAndPassword(login.getUserName(), login.getPassword());
        log.info("user - {}",user.isPresent());
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public User saveUser(User user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
}
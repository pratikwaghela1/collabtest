package com.pc.collabtest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pc.collabtest.dto.UserDto;
import com.pc.collabtest.mappers.UserMapper;
import com.pc.collabtest.model.Login;
import com.pc.collabtest.model.User;
import com.pc.collabtest.repository.AddressRepository;
import com.pc.collabtest.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
	
	
	private UserMapper userMapper;
	
	private UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
		this.userMapper = userMapper;
		this.userRepository = userRepository;
	}
	

	@Override
	public List<UserDto> getAllUsers() throws Exception {
		List<User> users = userRepository.findAll();
		log.info("users :: " + users);
		return userMapper.UserListToUserDtoList(users);
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
	public User saveUser(UserDto userDto) {
		try {
			
			User user = userMapper.UserDtoToUser(userDto);
			return userRepository.save(user);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
}
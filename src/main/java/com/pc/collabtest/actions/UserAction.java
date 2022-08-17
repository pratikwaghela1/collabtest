package com.pc.collabtest.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.collabtest.dto.UserDto;
import com.pc.collabtest.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserAction {
	private static final long serialVersionUID = 1L;
	public List<UserDto> users;

	@Autowired
	private UserService userService;

	@SuppressWarnings("unchecked")
	public String userList() throws Exception {
		users = userService.getAllUsers();
		return "success";
	}

}

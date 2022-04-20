package com.pc.collabtest.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.collabtest.model.User;
import com.pc.collabtest.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserAction {
	private static final long serialVersionUID = 1L;
	public List<User> users;

	@Autowired
	private UserService userService;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		users = userService.getAllUsers();
		return "success";
	}

}

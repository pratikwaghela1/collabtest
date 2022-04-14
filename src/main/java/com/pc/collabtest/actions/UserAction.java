package com.pc.collabtest.actions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pc.collabtest.model.User;
import com.pc.collabtest.service.ServiceFacade;

@Component
public class UserAction {
	private static final long serialVersionUID = 1L;
	private List<User> users;

	@Autowired
	private ServiceFacade userService;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		users = (List<User>) userService.doService("get");
		return "success";
	}

	public List<User> getUsers() {
		return users;
	}
}

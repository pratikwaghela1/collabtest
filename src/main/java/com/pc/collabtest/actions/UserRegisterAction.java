package com.pc.collabtest.actions;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.pc.collabtest.model.User;
import com.pc.collabtest.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserRegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Valid
	public User user;

	@Autowired
	private UserService userService;

	public String userRegisterForm() throws Exception {
		log.info("userRegisterForm() START");
		return "success";
	}

	public String userRegister() throws Exception {
		log.info("userRegister() START ********************");
		log.info("user - {}", user);
		if (user != null) {

			if (userService.saveUser(user) != null) {
				return "userList";
			}
		}
		return "userRegisterForm";
	}

	public User getUser() {
		log.info("getUserCall ................");
		return user;
	}

	public void setUser(User user) {
		log.info("setUserCall ................");
		this.user = user;
	}

}

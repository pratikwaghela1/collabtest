package com.pc.collabtest.actions;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.pc.collabtest.dto.UserDto;
import com.pc.collabtest.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserAddAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Valid
	public UserDto user;

	@Autowired
	private UserService userService;

	public String userAddForm() throws Exception {
		log.info("userRegisterForm() START");
		return "success";
	}

	public String userAdd() throws Exception {
		log.info("userRegister() START ********************");
		log.info("user - {}", user);
		if (user != null) {

			if (userService.saveUser(user) != null) {
				return "userList";
			}
		}
		return "userAddFrom";
	}

	public UserDto getUser() {
		log.info("getUserCall ................");
		return user;
	}

	public void setUser(UserDto user) {
		log.info("setUserCall ................");
		this.user = user;
	}

}

package com.pc.collabtest.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pc.collabtest.model.User;
import com.pc.collabtest.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserRegisterAction implements ModelDriven<User>{

	public User user = new User();
	
	@Autowired
	private UserService userService;
	
	public String userRegisterView() throws Exception {
		log.info("userRegisterView() START");
		return "success";
	}
	
	public String userRegister() throws Exception {
		log.info("userRegister() START ********************");
		log.info("user - {}",user);
		if(user != null) {
			if(userService.saveUser(user) != null) {
				return "userList";
			}
		}
		return "userRegisterView";
	}

	@Override
	public User getModel() {
		return user;
	}

	
}

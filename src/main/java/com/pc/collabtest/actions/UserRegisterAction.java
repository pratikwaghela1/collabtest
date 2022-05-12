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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Valid
	public User user;

	

	private String userName;
	
	
	public String userRegisterForm() throws Exception {
		log.info("userRegisterForm() START");
		return "success";
	}

	public String userRegister() throws Exception {
		log.info("userName " + userName);
		log.info("userRegister() START ********************");
		log.info("userRegister() START ********************");
		log.info("user - {}", user);

		if (user != null) {
			return "userList";
//			if(userService.saveUser(user) != null) {
//				
//			}
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

	public String getUserName() {
		log.info("getUserName ................");
		return userName;
	}

	public void setUserName(String userName) {
		log.info("setUserName ................");
		this.userName = userName;
	}

}

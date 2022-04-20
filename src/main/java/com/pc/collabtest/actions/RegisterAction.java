package com.pc.collabtest.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ModelDriven;
import com.pc.collabtest.model.User;
import com.pc.collabtest.service.RegisterService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RegisterAction implements ModelDriven<User>{

	public User user;
	
	@Autowired
	private RegisterService registerService;
	
	public String register() throws Exception {
		return "success";
	}
	
	public String doRegister() throws Exception {
		log.info("doRegister method call ********************");
		log.info("user - {}",user);
		
		return "success";
	}

	@Override
	public User getModel() {
		return new User();
	}
}

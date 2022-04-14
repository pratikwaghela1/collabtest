package com.pc.collabtest.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.pc.collabtest.service.UserService;

public class HelloAction extends ActionSupport {

	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {
		
		System.out.println("Calling hello action --------------------");
		System.out.println("Calling hello action --------------------");
		return SUCCESS;
	}

}
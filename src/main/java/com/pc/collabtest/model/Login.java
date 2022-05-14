package com.pc.collabtest.model;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class Login {

	@NotBlank(message="userName.required")
	private String userName;
	
	@NotBlank(message="password.required")
	private String password;
	
	private boolean rememberMe;
}

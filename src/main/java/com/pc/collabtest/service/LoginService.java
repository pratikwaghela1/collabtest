package com.pc.collabtest.service;

import com.pc.collabtest.model.LoginCredentials;

public interface LoginService {

	public void validateLogin(LoginCredentials credentials);
}

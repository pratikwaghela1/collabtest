package com.pc.collabtest.service;

import com.pc.collabtest.model.Login;
import com.pc.collabtest.model.User;

public interface LoginService {

	public User validateLogin(Login credentials);
}

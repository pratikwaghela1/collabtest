package com.pc.collabtest.dao;

import java.util.List;

import com.pc.collabtest.model.User;

public interface UserDAO {
	public List<User> getUsers();

	public void insertBatch();
}

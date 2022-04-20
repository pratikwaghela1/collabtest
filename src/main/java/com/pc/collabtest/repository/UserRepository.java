package com.pc.collabtest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pc.collabtest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public Optional<User> findByUserNameAndPassword(String userName,String password);
}

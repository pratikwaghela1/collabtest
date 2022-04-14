package com.pc.collabtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private String age;
	private String gender;
}
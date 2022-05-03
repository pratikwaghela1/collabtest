package com.pc.collabtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public final class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@NotBlank(message="firstName.required")
	private String firstName;
	@NotBlank(message="lastName.required")
	private String lastName;
	@NotBlank(message="age.required")
	private String age;
	@NotBlank(message="gender.required")
	private String gender;
	@NotBlank(message="password.required")
	private String password;
	@Transient
	@NotBlank(message="confirmPassword.required")
	private String confirmPassword;
	@NotBlank(message="userName.required")
	private String userName;
	@Size(min=1, message="email.required")
	@Email(message="email.format")
	private String email;
	
}
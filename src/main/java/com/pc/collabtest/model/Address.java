package com.pc.collabtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public final class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	@NotBlank(message="address1.required")
	private String address1;
	
	@NotBlank(message="address2.required")
	private String address2;
	
	@NotBlank(message="country.required")
	private String country;
	
	@NotBlank(message="state.required")
	private String state;
	
	@NotBlank(message="pinCode.required")
	private String pinCode;
}

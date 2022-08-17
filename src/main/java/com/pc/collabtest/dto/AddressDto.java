package com.pc.collabtest.dto;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

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

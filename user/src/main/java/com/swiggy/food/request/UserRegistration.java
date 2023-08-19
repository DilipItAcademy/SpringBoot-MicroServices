package com.swiggy.food.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistration {
	
	private String emailID;
	private String mobileNumber;
	private String password;
	

}

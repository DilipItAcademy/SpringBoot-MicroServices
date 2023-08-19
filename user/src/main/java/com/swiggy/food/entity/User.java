package com.swiggy.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="swiggy_users")
public class User {
	
	@Id
	private String emailID;
	private String mobileNumber;
	private String password;
	

}

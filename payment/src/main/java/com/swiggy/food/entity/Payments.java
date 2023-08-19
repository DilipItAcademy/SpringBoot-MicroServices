package com.swiggy.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="swiggy_payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payments {
	
	@Id
	@GeneratedValue
	private Integer paymentID;
	private String emailId;
	private String orderId;
	private double amountPaid;
	private String paymentStatus; 

}

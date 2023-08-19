package com.swiggy.food.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDetails {
	
	private String emailId;
	private String orderId;
	private double amountPaid;
	private String paymentStatus; 

}

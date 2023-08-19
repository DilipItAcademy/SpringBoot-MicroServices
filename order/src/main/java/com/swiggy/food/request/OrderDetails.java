package com.swiggy.food.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetails {

	private String emailID;
	private String orderId;
	private String product;
	private double totalAmount;

}

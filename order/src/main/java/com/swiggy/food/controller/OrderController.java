package com.swiggy.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.food.request.OrderDetails;
import com.swiggy.food.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/create")
	public String createOrder(@RequestBody OrderDetails orderDetails) {
		return orderService.createOrder(orderDetails);
	}
	@GetMapping("/details/{orderID}")
	public OrderDetails fetchOrder(@PathVariable String orderID) {
		return orderService.getOrderDetails(orderID);
	}
}

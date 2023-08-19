package com.swiggy.food.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.food.entity.Order;
import com.swiggy.food.repository.OrderRepository;
import com.swiggy.food.request.OrderDetails;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;

	public String createOrder(OrderDetails orderDetails) {

		Order order = Order.builder()
					.emailID(orderDetails.getEmailID())
					.orderId(orderDetails.getOrderId())
					.emailID(orderDetails.getEmailID())
					.product(orderDetails.getProduct())
					.totalAmount(orderDetails.getTotalAmount())
					.build();
		
		order = repository.save(order);

		return order.getOrderId();
	}

	public OrderDetails getOrderDetails(String orderID) {

		Order  order = repository.findById(orderID).get();
		
		OrderDetails orderDetails = OrderDetails.builder()
									.emailID(order.getEmailID())
									.orderId(order.getOrderId())
									.product(order.getProduct())
									.totalAmount(order.getTotalAmount())
									.build();
		
		return orderDetails;
	}

}

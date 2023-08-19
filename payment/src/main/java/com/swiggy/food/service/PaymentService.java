package com.swiggy.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.food.entity.Payments;
import com.swiggy.food.repository.PaymentRepository;
import com.swiggy.food.request.PaymentDetails;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository repository;
	
	public String makePayment(PaymentDetails paymentDetails) {
		
		Payments payments = Payments.builder()
							.amountPaid(paymentDetails.getAmountPaid())
							.emailId(paymentDetails.getEmailId())
							.orderId(paymentDetails.getOrderId())
							.paymentStatus(paymentDetails.getPaymentStatus())
							.build();

		
		payments = repository.save(payments);
		
		
		return "Please have paymentId for Tracking: "+payments.getPaymentID();
	}

	
}

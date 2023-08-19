package com.swiggy.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.food.request.PaymentDetails;
import com.swiggy.food.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@RequestMapping(method = RequestMethod.POST, value = "/make")
	public String makePayment(@RequestBody PaymentDetails paymentDetails) {

		return paymentService.makePayment(paymentDetails);
	}

}

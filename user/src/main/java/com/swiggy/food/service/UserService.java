package com.swiggy.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.food.entity.User;
import com.swiggy.food.feign.clients.PaymentMicroServiceFeignCleint;
import com.swiggy.food.register.UserRepository;
import com.swiggy.food.request.PaymentDetails;
import com.swiggy.food.request.UserLogin;
import com.swiggy.food.request.UserRegistration;

@Service
public class UserService {

	@Autowired
	PaymentMicroServiceFeignCleint paymentCleint;
	

	@Autowired
	UserRepository repository;

	public String userRegisteration(UserRegistration requrest) {

		User user = new User(requrest.getEmailID(), requrest.getMobileNumber(), requrest.getPassword());

		repository.save(user);

		return "USer Created Successfylly.";

	}

	public String userLogin(UserLogin requrest) {

		User user = repository.findByEmailIDAndPassword(requrest.getEmailID(), requrest.getPassword());

		return user.getEmailID();
	}

	public String paymentStatus(PaymentDetails details) {
		return paymentCleint.makePayment(details);
	}

}

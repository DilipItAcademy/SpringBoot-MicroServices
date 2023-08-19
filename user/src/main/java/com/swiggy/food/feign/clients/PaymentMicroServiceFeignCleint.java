package com.swiggy.food.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swiggy.food.request.PaymentDetails;

//Service ID of opposite MicroService/Producer , which MicroServie REST services 
//we are consuming from this specfic MS

// Host Name / Port Number
@FeignClient("payment-service")
public interface PaymentMicroServiceFeignCleint {
	
	@RequestMapping(method = RequestMethod.POST, value = "/payment/make")
	public String makePayment(@RequestBody PaymentDetails paymentDetails);

}

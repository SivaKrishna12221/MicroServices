package com.nt.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-service")
public class BillingServiceControllerClass {

	Logger logger= LoggerFactory.getLogger(BillingServiceControllerClass.class);
	 
	@GetMapping("/billing")
	public String calculateBillAmount()
	{
	logger.info("Billing -service controller Classs  ");
	int d=new Random().nextInt(1000);
	return "The Total bill amount is "+d;
	}
}

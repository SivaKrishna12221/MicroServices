package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.feigncomp.BillingServiceFiegnClient;

@RestController
@RequestMapping("/shopping-controller")
public class ShoppingControllerClass {

	@Value("${server:port}")
	public String pno;
	@Autowired
	private BillingServiceFiegnClient feign;
	
	@GetMapping("/select-prod")
	public String getProducts()
	{
	String bill=feign.getBillDetails();
	return "Port number of billing service is"+pno+"the products are pants shirts shoes "+bill;
	}
}

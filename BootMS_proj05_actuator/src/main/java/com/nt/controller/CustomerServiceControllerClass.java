package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerServiceControllerClass {

	@GetMapping("/welcome")
	public String custDetails()
	{
		return "customer info will be displayed here";
	}
}

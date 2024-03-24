package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-controller")
public class BillingControllerClass {
	@Value("${server.port}")
	private String pno;
	@GetMapping("/calc-bill")
	public String calculateBillAmount()
	{
		int num=new Random().nextInt(10000);
		return "Server"+pno+" The total bill amount is:"+num;
	}
}

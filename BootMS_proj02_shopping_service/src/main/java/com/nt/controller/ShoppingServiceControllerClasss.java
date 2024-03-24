package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.ShoppingServiceClientComponentClasss;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceControllerClasss {

	@Autowired
	private ShoppingServiceClientComponentClasss helper;
	@GetMapping("/bill-info")
	public ResponseEntity<String> getBillingServiceInfo()
	{
		String info=helper.gettingBillingInfo();
		return new ResponseEntity<String>("Flipcart :"+info,HttpStatus.OK);
	}
	
	
	
}

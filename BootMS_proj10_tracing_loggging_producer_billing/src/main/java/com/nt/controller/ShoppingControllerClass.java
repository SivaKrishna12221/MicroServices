package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping-service")
public class ShoppingControllerClass {

	@Autowired
	private RestTemplate template;
	 Logger logger=LoggerFactory.getLogger(ShoppingControllerClass.class);
	 @GetMapping("/shopping")
	public String  displayProducts()
	{
		logger.info("Shopping controller class get method");
		ResponseEntity<String> bill=template.getForEntity("http://localhost:5000/billing-service/billing", String.class);
		String body = bill.getBody();
		return "your products are shirts ,pants ,shoes And your bill is "+body;
	}
}

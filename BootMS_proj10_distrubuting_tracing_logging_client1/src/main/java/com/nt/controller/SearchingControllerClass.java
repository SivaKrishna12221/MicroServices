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
@RequestMapping("/search-service")
public class SearchingControllerClass {

	@Autowired
	private RestTemplate temp;
	Logger logger = LoggerFactory.getLogger(SearchingControllerClass.class);

	@GetMapping("/searching")
	public String serchforTheProducts() {
		System.out.println("search services");
		logger.info("Search controller class");
		ResponseEntity<String> result = temp
				.getForEntity("http://localhost:5001/shopping-service/shopping-service/shopping", String.class);
		String body = result.getBody();
		return "Flipkart " + body;
	}

}

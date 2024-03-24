package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchServiceRestController {

	@GetMapping("/info")
	public ResponseEntity<String> searchRestInfo()
	{
		return new ResponseEntity<String>("Flipcart search services are avialble:",HttpStatus.OK);
	}
}

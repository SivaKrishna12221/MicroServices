package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/results")
public class StudentResultsControllerClass {
 
	
	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "userDefineFallBackMethod",commandProperties = {
			@HystrixProperty(name="circuitBreaker.enabled",value="true"),
			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="5"),
			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000")
	})
	public String displayResults()
	{
	  System.out.println("StudentResultsControllerClass.displayResults():");
	  int num=new Random().nextInt(10);
	  if(num<9)
	  {
		 throw new RuntimeException("problem raised in business logic");
	  }
	int  results=new Random().nextInt(500);
	 return "students results are:"+results;
	}
	public String userDefineFallBackMethod()
	{
		System.out.println("StudentResultsControllerClass.fallbackMethod()");
		return " server busy";
	}
	
}

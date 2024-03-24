package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/resillience")
public class ResillienceTestController {

	@GetMapping("/test")
	@CircuitBreaker(name="myCircuitBreaker",fallbackMethod = "fallBackMethod")
	@Retry(name = "myRetry", fallbackMethod = "fallback")
	public String businessLogicMethod()
	{
	  int num=new Random().nextInt(5);
	  if(num<2)
	  {
		  throw new RuntimeException("number should not be zero");
	  }
	  else
	  {
		  return "Business method executed";
	  }
	}
	public String fallBackMethod()
	{
		return "fall back method is executed";
	}
}

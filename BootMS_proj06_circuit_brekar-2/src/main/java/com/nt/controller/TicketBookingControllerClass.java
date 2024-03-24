package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/ticket")
public class TicketBookingControllerClass {

	@GetMapping("/show/{id}")
	@CircuitBreaker(name="ticketService" ,fallbackMethod = "ticketProblem")
	public String ticketCounter(@PathVariable Integer id)
	{
		int num=new Random().nextInt(10);
		if(id<9)
			throw new RuntimeException("problem raised in business logics");
		return "tickets are booked";
		
	}
	public String ticketProblem()
	{
		return "server issue";
	}
}

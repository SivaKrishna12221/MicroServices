package com.nt.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@RestController
@RequestMapping("/billing")
public class BillingServiceControllerClass {

	@GetMapping("/billing-info")
	public ResponseEntity<String> getBillingInfo()
	{
		return new ResponseEntity<String>("We accept card payment,upi payment,banking payment",HttpStatus.OK);
	}
	@GetMapping("/bill")
	public ResponseEntity<String> billingDetails()
	{
		int bill=new Random().nextInt(1000);
		return new ResponseEntity<String>("Your Total bill is"+ bill,HttpStatus.OK);
	}
	@GetMapping("/get-emp")
	public ResponseEntity<Employee> getEmpDetails()
	{
		Employee employee = new Employee(32,"siva");
		return ResponseEntity.ok(employee);
	}
	
}

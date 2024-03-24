package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.BillInfo;

@RestController
@RequestMapping("/billing_module")
public class BillingServiceControllerClass {

	@Value("${server.port}")
	private Integer portNumber;

	
	//  @Value("${eureka.instance.instance-id}") private String instanceId;
	 
	@GetMapping("/billing_info_operation")
	public ResponseEntity<String> billingInfoOperationMethod()
	{
	   return new ResponseEntity<String>("Accept card_payment,bank_payment,phone_pay:serverPort"+portNumber,HttpStatus.OK);
	}
	@GetMapping("/bill-info")
	public ResponseEntity<BillInfo> getBillInfo()
	{
		BillInfo billInfo = new BillInfo(121,"siva",new String[] {"mobile","laptob"}, 75000d);
		return new ResponseEntity<BillInfo>(billInfo,HttpStatus.OK);
	}
	
}

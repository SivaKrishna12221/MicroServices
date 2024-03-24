package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.feign.IBillingServiceInterface;
import com.nt.model.BillInfo;

@RestController
@RequestMapping("/shopping_service_module")
public class ShoppingServiceControllerClasss {

	@Autowired
	//private ShoppingServiceHelperClass helper;
	private IBillingServiceInterface feignClient;
	@GetMapping("/fetch_billing_info")
	public ResponseEntity<String> fetchBillingInfoOperation()
	{
	//String result=	helper.fetchBillingInfoDetails();
		ResponseEntity<String> res=feignClient.fetchBillingServiceDetails();
		String result=res.getBody();
		return new ResponseEntity<String>("Flipcart"+result,HttpStatus.OK);
	}
	@GetMapping("bill-info")
	public ResponseEntity<BillInfo> fetchBillInfo()
	{
		/*ResponseEntity<BillInfo> billDetails = feignClient.getBillDetails();
		BillInfo body = billDetails.getBody();
		return ResponseEntity.ok(body);*/
		BillInfo billDetails = feignClient.getBillDetails();
		return ResponseEntity.ok(billDetails);
	}
}

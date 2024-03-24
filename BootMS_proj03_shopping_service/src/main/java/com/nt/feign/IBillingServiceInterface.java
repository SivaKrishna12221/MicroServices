package com.nt.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.BillInfo;

@FeignClient("billing-service-flipkart")
public interface IBillingServiceInterface {

	@GetMapping("/billing_module/billing_info_operation")
	public ResponseEntity<String> fetchBillingServiceDetails();
	
	/*@GetMapping("/billing_module/bill-info")
	public ResponseEntity<BillInfo> getBillDetails();//if we want to response details we can use response Entity object
	*/
	@GetMapping("/billing_module/bill-info")
	public BillInfo getBillDetails();//if don't want response details you want only response object we can mention Bill-info type
	
}

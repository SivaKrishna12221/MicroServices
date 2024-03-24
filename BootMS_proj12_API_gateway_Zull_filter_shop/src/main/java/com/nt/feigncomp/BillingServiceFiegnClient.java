package com.nt.feigncomp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("billing-service")
public interface BillingServiceFiegnClient {

	@GetMapping("/billing-controller/calc-bill")
	public String  getBillDetails();
}

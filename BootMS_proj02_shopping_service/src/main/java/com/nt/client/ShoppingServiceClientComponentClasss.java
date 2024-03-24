package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ShoppingServiceClientComponentClasss // helperclass
{
	@Autowired
	private DiscoveryClient client;

	public String gettingBillingInfo() {
		// getting service instances of particular service
		List<ServiceInstance> instances = client.getInstances("billing-service");
		// use first service instance instance in the list
		ServiceInstance si = instances.get(0);
		// get producer ms service uri;
		String serviceUrl = si.getUri() + "/billing/billing-info";
		System.out.println("===========*******************=============");
		System.out.println(serviceUrl);
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(serviceUrl, String.class);
		String body = response.getBody();
		System.out.println("#############********************#########3");
		System.out.println(body);
		return body;
	}

}

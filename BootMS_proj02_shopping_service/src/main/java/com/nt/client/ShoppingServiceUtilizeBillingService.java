package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class ShoppingServiceUtilizeBillingService {

	@Autowired
	private DiscoveryClient client;
	
	public Employee getEmployee() throws JsonMappingException, JsonProcessingException
	{
		
		List<ServiceInstance> instances = client.getInstances("billing-service");
		ServiceInstance serviceInstance = instances.get(0);
		String serviceUrl=serviceInstance.getUri()+"/billing/get-emp";
	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<String> forEntity = restTemplate.getForEntity(serviceUrl,String.class);
	    ObjectMapper objectMapper = new ObjectMapper();
	    String body = forEntity.getBody();
	    Employee readValue = objectMapper.readValue(body,Employee.class);
	    return readValue;
	}
}

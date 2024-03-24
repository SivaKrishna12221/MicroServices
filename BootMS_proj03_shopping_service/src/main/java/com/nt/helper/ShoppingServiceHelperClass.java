package com.nt.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component("helper")
public class ShoppingServiceHelperClass {

	@Autowired
	private DiscoveryClient client;
	RestTemplate template=new RestTemplate();
    public String fetchBillingInfoDetails()
    {
    List<ServiceInstance> listInstance=	client.getInstances("billing_service2");
    ServiceInstance si= listInstance.get(0);
    String serviceUrl=si.getUri()+"/billing_module/billing_info_operation";
    ResponseEntity<String> resp=template.exchange(serviceUrl, HttpMethod.GET, null, String.class);
     String body= resp.getBody();
     return body;
    }
}

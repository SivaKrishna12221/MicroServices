package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BootMsProj11ApiGatewayUsingFlipkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj11ApiGatewayUsingFlipkartApplication.class, args);
	}

}

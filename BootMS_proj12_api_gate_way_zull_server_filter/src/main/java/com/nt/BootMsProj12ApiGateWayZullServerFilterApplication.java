package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class BootMsProj12ApiGateWayZullServerFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj12ApiGateWayZullServerFilterApplication.class, args);
	}

}

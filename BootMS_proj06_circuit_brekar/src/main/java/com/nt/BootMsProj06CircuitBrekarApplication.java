package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class BootMsProj06CircuitBrekarApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootMsProj06CircuitBrekarApplication.class, args);
	}

}

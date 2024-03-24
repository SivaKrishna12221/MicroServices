package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class BillingConfig {

	@Bean
	public Sampler createsampler()
	{
		return Sampler.ALWAYS_SAMPLE;
	}
	
}

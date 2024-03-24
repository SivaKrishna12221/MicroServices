package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class ConfigurationClass {

	@Bean
	public Sampler createSamplerObjec()
	{
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Bean
	public RestTemplate createRestTEmplate()
	{
		return new RestTemplate();
	}
	
}

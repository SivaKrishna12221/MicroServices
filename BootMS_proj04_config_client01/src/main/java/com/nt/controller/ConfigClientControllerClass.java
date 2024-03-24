package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigClientControllerClass {

	@Value("${dbuser}")
	private String username;
	@Value("${dbpword}")
	private String password;
	
	@GetMapping("/dbinfo")
	public String getDbInfo()
	{
		return "Username and password details are taken from gitlab account using config server-><html><body><h1>"+username+","+password+"</h1></body></html>";
	}
}

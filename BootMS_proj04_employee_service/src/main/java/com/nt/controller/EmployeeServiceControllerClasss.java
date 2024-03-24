package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp-service-module")
@RefreshScope
public class EmployeeServiceControllerClasss {

	@Value("${dbuser}")
	private String user;
	@Value("${dbpword}")
	private String pword;
	@GetMapping("/show")
	public ResponseEntity<String> showDetailsFromGitLab()
	{
	return new ResponseEntity<String>("username: "+user+",password: "+pword+" details ",HttpStatus.OK);
	}

}

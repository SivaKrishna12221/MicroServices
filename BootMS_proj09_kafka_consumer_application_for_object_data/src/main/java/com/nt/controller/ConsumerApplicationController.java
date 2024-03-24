package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.storage.KafkaMessageStorages;

@RestController
@RequestMapping("/kafka")
public class ConsumerApplicationController {

	@Autowired
	private KafkaMessageStorages messagestore;
	@GetMapping("/readall-message")
	public String readAllMessageFromKafka()
	{
		return "message from kafka"+messagestore.getListOfRecordsfromstorage();
	}
	
}

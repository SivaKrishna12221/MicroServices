package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.storage.MessageStoragesClasss;

@RestController
@RequestMapping("/kafka-consumer-2")
public class KafkaConsumerControllerClass {
    @Autowired
    private MessageStoragesClasss storage;
    @GetMapping("/message2")
	public String getRestMessage()
	{
		List<String> list=storage.sendAllmessages();
		return list.toString();
	}
}

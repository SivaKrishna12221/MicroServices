package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.kafkaProd.KafkaProducerComponent;
import com.nt.storage.KafkaConsumerMessageStore;

@RestController
@RequestMapping
public class KafkaController {

	@Autowired
	private KafkaProducerComponent kafka;
	@Autowired
	private KafkaConsumerMessageStore store;
	@GetMapping("/send/{message}")
	public String sendMessageToSubscribers(@PathVariable("message") String message)
	{
		String sendMessageToSubscribers = kafka.sendMessageToSubscribers(message);
		return sendMessageToSubscribers;
	}
	@GetMapping("/read-all")
	public ResponseEntity<List<String>> showAllMessages()
	{
		List<String> showAllMessages = store.showAllMessages();
		return ResponseEntity.ok(showAllMessages);
	}
	
}

package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.beans.KafkaCommunicationComponent;
import com.nt.messagestore.KafkaMessageStoreComponent;

@RestController
public class KafkaCommunicationControllerr {

	@Autowired
	private KafkaCommunicationComponent kafkacomp;
	@Autowired
	private KafkaMessageStoreComponent consumer;
	@GetMapping("/send/{message}")
	public String sendMesssageToKafka(@PathVariable("message") String message)
	{
		String result=kafkacomp.passingMessageToKafka(message);
		return result;
	}
	@GetMapping("/readall")
	public String readAllTheMessagesFromKafka()
	{
		return " <h2>"+ consumer.readAllMessageFromStore() +"</h2>";
	}
}

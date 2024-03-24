package com.nt.kafkaProd;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerComponent {

	@Value("${app.topic.name}")
	private String topicName;
	@Autowired
	private KafkaTemplate<String,String> template;
	public String sendMessageToSubscribers(String message)
	{
		CompletableFuture<SendResult<String, String>> send = template.send(topicName, message);
		return "message sent";
	}
	
}



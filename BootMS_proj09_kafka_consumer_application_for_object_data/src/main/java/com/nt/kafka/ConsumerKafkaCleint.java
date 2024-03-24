package com.nt.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.storage.KafkaMessageStorages;

@Component("consumer-comp")
public class ConsumerKafkaCleint {

	@Autowired
	private KafkaMessageStorages messagestore;
	
	@KafkaListener(topics="${app.topic.name}",groupId="grouping")
	public void addData(String message)
	{
		messagestore.addMessage(message);
	}
	
}

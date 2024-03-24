package com.nt.kafkacomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.storage.MessageStoragesClasss;

@Component
public class KafkaComponentInteraaction {

	@Autowired
	private MessageStoragesClasss storage;
	@KafkaListener(topics="nit-tpc-test2",groupId="nit-grouping")
	public void getMessageFromkafa(String message)
	{
		storage.addMessage(message);
	}
}

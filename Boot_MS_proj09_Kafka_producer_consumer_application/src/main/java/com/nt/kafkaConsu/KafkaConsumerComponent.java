package com.nt.kafkaConsu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.storage.KafkaConsumerMessageStore;

@Component
public class KafkaConsumerComponent {

	@Autowired
	private KafkaConsumerMessageStore store;
	@KafkaListener(topics="${app.topic.name}",groupId = "march-group")
	public void  recieveMessage(String text)
	{
		store.storeMessage(text);
	}
}

package com.nt.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.messagestore.KafkaMessageStoreComponent;

@Component
public class KafkaMessagConsumerApp {
  @Autowired
  private KafkaMessageStoreComponent  storeComponent;
    @KafkaListener(topics="${app.topic.name}",groupId="grouping-id")
	public void  addMessage(String message)
	{
	    storeComponent.addMessage(message);	
	}
}

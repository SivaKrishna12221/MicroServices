package com.nt.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component("kafka-producer")
public class KafkaProducerComponet {

	@Autowired
	private KafkaTemplate<String, String> kafkaClient;
	@Value("${app.topic.name}")
	private String topicname;
	
	public String sendDataToKafka(String message)
	{
		kafkaClient.send(topicname,message);
		kafkaClient.send(topicname,message);
		return "data sent to kafka ecosystem";
	}
}

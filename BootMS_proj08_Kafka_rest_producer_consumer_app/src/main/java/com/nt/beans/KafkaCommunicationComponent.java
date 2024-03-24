package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component("kafkaProducer")
public class KafkaCommunicationComponent {

	@Autowired
	private KafkaTemplate<String,String> kafka;
	
	@Value("${app.topic.name}")
	private String topicname;
	
	public String passingMessageToKafka(String message)
	{
	    kafka.send(topicname, message);
		return "message sent";
		
	}
}

package com.nt.kafkaRecieveMessage;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;


public class KafkaConsumerTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
		properties.put(ConsumerConfig.GROUP_ID_CONFIG,"group-consumer");
		KafkaConsumer<String,String> kafkaConsumer = new KafkaConsumer<String,String>(properties);
		kafkaConsumer.subscribe(Arrays.asList("player-topic"));
		while(true)
		{
			ConsumerRecords<String,String> poll = kafkaConsumer.poll(Duration.ofMillis(10000));
		    for(ConsumerRecord<String,String> p:poll)
		    {
		    	System.out.println("data:"+p.toString());
		    }
		}
	}
}

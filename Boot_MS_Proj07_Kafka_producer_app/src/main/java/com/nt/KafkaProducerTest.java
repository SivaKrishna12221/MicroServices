package com.nt;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class KafkaProducerTest {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		String name = StringSerializer.class.getName();
		System.out.println("string serializer;" + name);
		KafkaProducer<String, String> prod = new KafkaProducer<String, String>(props);
		String message = "Welcome to the Kafka producer application";
		String topicname = "nit-tpc-test";
		ProducerRecord<String,String> record = new ProducerRecord<String, String>(topicname, message);
		prod.send(record);
		prod.flush();
		prod.close();
		System.out.println("message sent");
	}
}

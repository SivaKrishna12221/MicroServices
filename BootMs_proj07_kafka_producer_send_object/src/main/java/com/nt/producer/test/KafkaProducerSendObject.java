package com.nt.producer.test;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class KafkaProducerSendObject {

	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		String result = StringSerializer.class.getName();
		System.out.println(result);
		PlayerInfo playerInfo = new PlayerInfo("siva", 12, "jp");
		String playerString = playerInfo.toString();
		ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("player-topic",
				playerString);
		KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
		kafkaProducer.send(producerRecord);
		System.out.println("message sent ");
	}
}

package com.nt;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;


public class KafkaConsumerApplication {

	public static void main(String[] args) {
		
	  Properties props=new 	Properties();
	  props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
	  props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
	  props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class.getName());
	  props.put(ConsumerConfig.GROUP_ID_CONFIG,"group1_consumers");
	  KafkaConsumer<String,String> consumer=new KafkaConsumer<String,String>(props);
	  consumer.subscribe(Arrays.asList("nit-tpc-test"));
	  while(true)
	  {
		 ConsumerRecords<String,String> records  =consumer.poll(Duration.ofMillis(10000));
		 for( ConsumerRecord<String,String> record:records)
		 {
			 System.out.println("producer message is"+record.value());
		 }
	  }
	}
}

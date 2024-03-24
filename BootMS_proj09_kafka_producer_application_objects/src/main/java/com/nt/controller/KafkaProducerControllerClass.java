package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.kafka.KafkaProducerComponet;
import com.nt.model.Student;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerControllerClass {

	@Autowired
	private KafkaProducerComponet kafkacomp;					
	
	@PostMapping("/send-data")
	public String sendingObjectDataToKafka(@RequestBody Student stu)
	{
	   String data=stu.toString();
	   String result=kafkacomp.sendDataToKafka(data);
	   return result;
	}
}

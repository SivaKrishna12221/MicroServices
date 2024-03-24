package com.nt.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMessageStore {

	private List<String> messages=new ArrayList<String>();
	public void storeMessage(String message)
	{
		messages.add(message);
	}
	public List<String> showAllMessages()
	{
		return messages;
	}
}

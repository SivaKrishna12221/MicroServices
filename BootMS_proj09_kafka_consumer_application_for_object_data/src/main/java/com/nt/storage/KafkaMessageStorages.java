package com.nt.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("messageStorage")
public class KafkaMessageStorages {

	private List<String> listofrecords=new ArrayList<String>();
	
	public void addMessage(String message)
	{
		listofrecords.add(message);
	}
	public List<String> getListOfRecordsfromstorage()
	{
		return listofrecords;
	}
}

package com.nt.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class MessageStoragesClasss {

	private List<String>  list=new ArrayList<String>();
	public void addMessage(String message)
	{
		list.add(message);
	}
	public List<String> sendAllmessages()
	{
		return list;
	}
}

package com.nt.jms;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;
@Component("jms")
public class ManufactureDept {

	@Autowired
	private JmsTemplate jmst;
	public String puttingMessageIntoJms()
	{
		jmst.send("testmq1", new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				Message msg=session.createTextMessage("we need tyres to manufacture"+new Date());
				return msg;
			}
		});
	   return "Message sent";
	}
	
}

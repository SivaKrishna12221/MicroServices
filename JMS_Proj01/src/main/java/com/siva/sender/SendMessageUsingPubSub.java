package com.siva.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class SendMessageUsingPubSub {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Scheduled(cron="0/20 * * * * *")
	public void publishingMessage()
	{
	    //destination name and using messageCreater Interface to send text message
		jmsTemplate.send("jms_test02",ses->ses.createTextMessage("From Publisher application:"+new Date()));
		System.out.println("message sent from publisher:"+new Date());
	}
}

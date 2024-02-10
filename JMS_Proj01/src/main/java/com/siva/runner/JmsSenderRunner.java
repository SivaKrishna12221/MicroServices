package com.siva.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
//@Component
public class JmsSenderRunner implements CommandLineRunner{

	@Autowired
	 private JmsTemplate jmsTemp;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*jmsTemp.send("jms_test01", new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage message= session.createTextMessage("Message send from JmsProj01:"+new Date());
				return message;
			}
		});*/
		
		jmsTemp.send("jms_test01",ses-> ses.createTextMessage("Message send from JmsProj01:"+new Date()));
		System.out.println("message sent:"+new Date());
	}
}


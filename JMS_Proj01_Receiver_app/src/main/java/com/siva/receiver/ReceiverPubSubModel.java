package com.siva.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class ReceiverPubSubModel {

	@JmsListener(destination="jms_test02")
	//@Scheduled(cron="0/20 * * * * *")// parameterized method scheduled is not possible
	public void readMessage(String message)
	{
		
		System.out.println("received message:"+message);
	}
}

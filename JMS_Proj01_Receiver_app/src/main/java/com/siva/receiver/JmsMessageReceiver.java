package com.siva.receiver;

import org.springframework.jms.annotation.JmsListener;

//@Component
public class JmsMessageReceiver {

	@JmsListener(destination="jms_test01")
	public void consumeMessage(String message)
	{
	   System.out.println("message recieved:"+message);
	}
}


package com.siva.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component
public class ReceiveMessageFromPublisher {

	@JmsListener(destination="jms_test03")
	public void reciveObjectData(Employee emp)
	{
	System.out.println("message received:"+emp);
	}
}



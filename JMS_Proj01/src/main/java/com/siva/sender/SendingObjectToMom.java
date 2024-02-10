package com.siva.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component
public class SendingObjectToMom {

  @Autowired
   private 	JmsTemplate template;
  
  @Scheduled(cron="0/20 * * * * *")
  public void sendObjectToMom()
  {
	  Employee emp1 = new Employee(101,"siva","kadapa",10000.0);
	 template.convertAndSend("jms_test03", emp1);
	 System.out.println("message sent at:"+new Date());
  }
}

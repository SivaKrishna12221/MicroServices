package com.nt;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryDeptClass {

  @JmsListener(destination="testmq1")
   public void  readMessage(String msg)
   {
	 System.out.println("message from jms "+msg);
   }
	
}

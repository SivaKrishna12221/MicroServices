package com.nt.messagestore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("consumerComponent")
public class KafkaMessageStoreComponent {

   private List<String> listofRecords=	new ArrayList<String>();
   
   public void addMessage(String message)
   {
	   listofRecords.add(message);
   }
   public String readAllMessageFromStore()
   {
	   return listofRecords.toString();
   }
}

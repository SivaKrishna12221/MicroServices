package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.jms.ManufactureDept;

@SpringBootApplication
public class BootJmsProj01ProducerAppApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootJmsProj01ProducerAppApplication.class, args);
	ManufactureDept dept=ctx.getBean("jms",ManufactureDept.class);
	String result=dept.puttingMessageIntoJms();
	System.out.println(result);
	}

}

package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.model.IPLTeam;
import com.nt.service.IIPLMgmtService;

@SpringBootApplication
public class BootMsProj04ConfigClient02Application {

	
	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(BootMsProj04ConfigClient02Application.class, args);
	IIPLMgmtService service=ctx.getBean("ipl-service",IIPLMgmtService.class);
	String result=service.registerIplTeamDeatials(new IPLTeam());
	System.out.println(result);
	}

}

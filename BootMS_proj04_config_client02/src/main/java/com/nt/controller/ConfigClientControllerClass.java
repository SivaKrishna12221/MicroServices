package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.IPLTeam;
import com.nt.service.IIPLMgmtService;

@RestController
@RequestMapping("/Ipl")
public class ConfigClientControllerClass {

	@Value("something")
     private String message;
	@Autowired
	private IIPLMgmtService service;
	@GetMapping("/Ipl-service")
	public String message()
	{
		return message+"is taken from github yml file";
	}
	@GetMapping("/get-ipl-team/{id}")
	public ResponseEntity<IPLTeam> getIplTeam(@PathVariable("id") Integer id)
	{
		IPLTeam fetchIplTeamById = service.fetchIplTeamById(id);
		return ResponseEntity.ok(fetchIplTeamById);
	}
	@GetMapping("/get-all-team-details")
	public ResponseEntity<List<IPLTeam>> getListOfTeams()
	{
		List<IPLTeam> fetchAllTeamsDetails = service.fetchAllTeamsDetails();
		return ResponseEntity.ok(fetchAllTeamsDetails);
	}
	
	
}

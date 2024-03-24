package com.nt.service;

import java.util.List;

import com.nt.model.IPLTeam;

public interface IIPLMgmtService {

	public String registerIplTeamDeatials(IPLTeam team);
	
	public IPLTeam fetchIplTeamById(Integer id);
	
	public List<IPLTeam>  fetchAllTeamsDetails();
	
	
}

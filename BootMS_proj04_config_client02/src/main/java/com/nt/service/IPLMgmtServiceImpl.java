package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.IPLTeam;
import com.nt.repo.IIplTeamRepository;
@Service("ipl-service")
public class IPLMgmtServiceImpl implements IIPLMgmtService {

	@Autowired
	private IIplTeamRepository teamRepo;
	@Override
	public String registerIplTeamDeatials(IPLTeam team) {
		team.setTcaptain("dhoni");
		team.setTlocation("chennai");
		team.setTname("chennai super kings");
		team.setTowner("n srinivasan");
		Integer id=teamRepo.save(team).getTeamId();
		return "Team:"+id+" is Registered Succesfully"; 
	}
	@Override
	public IPLTeam fetchIplTeamById(Integer id) {
		
		return teamRepo.findById(id).get();
	}
	@Override
	public List<IPLTeam> fetchAllTeamsDetails() {
		
	return	teamRepo.findAll();
	}

}

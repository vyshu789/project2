package com.app.Team_Service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Team_Service.Entity.Team;
import com.app.Team_Service.Repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepo;
	
	public Team saveTeam(Team team)
	{
		return teamRepo.save(team);
	}
	
	public Team fetchTeamByName(String teamName)
	{
		return teamRepo.findByTeamName(teamName);
	}
	
	public List<String> allTeamName()
	{
		return teamRepo.TeamNames();
	}

	
}

package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.model.Team;
import com.xib.assessment.repository.TeamRepository;

@Service
class TeamServiceImpl implements TeamService{
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public Optional<Team> findTeam(Long id) {
		return teamRepository.findById(id);
	}

	@Override
	public List<Team> findAllTeams() {
		return teamRepository.findAll();
	}

	@Override
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public List<Team> findEmptyTeams() {
		return teamRepository.findEmptyTeams();
	}
}

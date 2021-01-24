package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import com.xib.assessment.model.Team;

public interface TeamService {
	Optional<Team> findTeam(Long id);
	List<Team> findAllTeams();
	Team saveTeam(Team team);
}

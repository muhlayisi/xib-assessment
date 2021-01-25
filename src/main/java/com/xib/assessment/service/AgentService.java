package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.xib.assessment.model.Agent;
import com.xib.assessment.model.Team;

public interface AgentService {
	Optional<Agent> findAgent(Long id);
	List<Agent> findAllAgents();
	Agent saveAgent(Agent agent);
	Agent assignAgent(Long id, Team team);
	Page<Agent> pageableAgents(int page);
}

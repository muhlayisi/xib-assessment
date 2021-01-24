package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import com.xib.assessment.model.Agent;

public interface AgentService {
	Optional<Agent> findAgent(Long id);
	List<Agent> findAllAgents();
	Agent saveAgent(Agent agent);
}

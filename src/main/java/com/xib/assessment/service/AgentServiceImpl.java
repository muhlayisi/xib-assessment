package com.xib.assessment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.model.Agent;
import com.xib.assessment.model.Team;
import com.xib.assessment.repository.AgentRepository;

@Service
class AgentServiceImpl implements AgentService{
	
	@Autowired
	private AgentRepository agentRepository;
	
	@Override
	public Optional<Agent> findAgent(Long id) {
		return agentRepository.findById(id);
	}

	@Override
	public List<Agent> findAllAgents() {
		return agentRepository.findAll();
	}

	@Override
	public Agent saveAgent(Agent agent) {
		return agentRepository.save(agent);
	}
	
	@Override
	public Agent assignAgent(Long id, Team team) {
		Optional<Agent> agentObject = agentRepository.findById(id);
		
		Agent agent = agentObject.orElse(null);
		
		agent.setTeam(team);
		
		return agentRepository.save(agent);
	}
}

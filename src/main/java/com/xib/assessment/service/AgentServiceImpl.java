package com.xib.assessment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.model.Agent;
import com.xib.assessment.repository.AgentRepository;

@Service
class AgentServiceImpl implements AgentService{
	
	@Autowired
	private AgentRepository agentRepository;
	
	@Override
	public Optional<Agent> findAgent(Long id) {
		return agentRepository.findById(id);
	}
}

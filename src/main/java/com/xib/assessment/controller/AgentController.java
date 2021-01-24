package com.xib.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.model.Agent;
import com.xib.assessment.model.Team;
import com.xib.assessment.service.AgentService;

@RestController
@RequestMapping(value="/api", produces="application/json")
public class AgentController {
	
	@Autowired
	private AgentService agentService;

    @GetMapping("/agent/{id}")
    public ResponseEntity<Agent> findAgent(@PathVariable("id") Long id) {
    	return ResponseEntity.ok(agentService.findAgent(id).orElse(new Agent()));
    }
    
    @GetMapping("/agents")
    public ResponseEntity<List<Agent>> findAllAgents() {
    	return ResponseEntity.ok(agentService.findAllAgents());
    }
    
    @PostMapping("/agent")
    public ResponseEntity<Agent> saveAgent(@RequestBody Agent agent) {
    	return ResponseEntity.ok(agentService.saveAgent(agent));
    }
}

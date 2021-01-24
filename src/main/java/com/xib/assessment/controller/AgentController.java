package com.xib.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.model.Agent;
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
}

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

import com.xib.assessment.model.Team;
import com.xib.assessment.service.TeamService;

@RestController
@RequestMapping(value="/api", produces="application/json")
public class TeamController {
	
	@Autowired
	private TeamService teamService;

    @GetMapping("/team/{id}")
    public ResponseEntity<Team> findTeam(@PathVariable("id") Long id) {
    	return ResponseEntity.ok(teamService.findTeam(id).orElse(new Team()));
    }
    
    @GetMapping("/teams")
    public ResponseEntity<List<Team>> findAllTeams() {
    	return ResponseEntity.ok(teamService.findAllTeams());
    }
    
    @PostMapping("/team")
    public ResponseEntity<Team> saveTeam(@RequestBody Team team) {
    	return ResponseEntity.ok(teamService.saveTeam(team));
    }
    
    @GetMapping("/teams/empty")
    public ResponseEntity<List<Team>> findEmptyTeams() {
    	return ResponseEntity.ok(teamService.findEmptyTeams());
    }
    
}

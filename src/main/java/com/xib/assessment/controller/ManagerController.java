package com.xib.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xib.assessment.model.Manager;
import com.xib.assessment.service.ManagerService;

@RestController
@RequestMapping(value="/api", produces="application/json")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
    
    @PostMapping("/manager")
    public ResponseEntity<Manager> saveManager(@RequestBody Manager manager) {
    	return ResponseEntity.ok(managerService.saveManager(manager));
    }
}

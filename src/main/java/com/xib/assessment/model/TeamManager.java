package com.xib.assessment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "team_manager")
public class TeamManager{
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name ="manager_id")
    private Long managerId;
	@Column(name ="team_id")
    private Long teamId;
    
}

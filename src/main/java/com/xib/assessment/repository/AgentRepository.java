package com.xib.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xib.assessment.model.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}

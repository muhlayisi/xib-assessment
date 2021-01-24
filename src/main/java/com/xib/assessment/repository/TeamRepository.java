package com.xib.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xib.assessment.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {}

package com.xib.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xib.assessment.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
	@Query("select t from team t WHERE t.id NOT IN (SELECT teamId FROM team_manager) AND t NOT IN (SELECT team FROM agent)")
	List<Team> findEmptyTeams();
}

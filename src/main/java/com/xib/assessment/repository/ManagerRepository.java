package com.xib.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xib.assessment.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {}

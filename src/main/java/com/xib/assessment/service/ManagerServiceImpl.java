package com.xib.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xib.assessment.model.Manager;
import com.xib.assessment.repository.ManagerRepository;

@Service
class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerRepository managerRepository;

	@Override
	public Manager saveManager(Manager manager) {
		return managerRepository.save(manager);
	}
}

package com.revature.p2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.repo.InmateRepository;
import com.revature.p2.repo.Pending;

@Service
public class PendingServiceImpl implements PendingService {

	@Autowired
	@Qualifier(value = "pendingRepository")
	Pending pendingRepository;
	
	@Autowired
	@Qualifier(value = "inmateRepository")
	InmateRepository inmateRepository;
	
	public List<Pending> findByStatus(status status) {
		
		return pendingRepository.findByStatus(status);
		
	}
	
	public List<Pending> findAllStatus() {
		
		return pendingRepository.findAllStatus();
		
	}

	// The approval update
	// Once approved, it overwrites the inmateRepository with proposed changes
	
	public void updateChanges (int id, Inmate inmate) {
		
		inmateRepository.save(inmate);
		
	}
	
}

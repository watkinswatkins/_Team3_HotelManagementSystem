package com.revature.p2.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.p2.model.Block;
import com.revature.p2.model.Block.block;
import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.repo.BlockRepository;
import com.revature.p2.repo.InmateRepository;
import com.revature.p2.repo.Pending;

@Service
public class InmateServiceImpl implements InmateService {

	@Autowired
	@Qualifier(value = "inmateRepository")
	InmateRepository inmateRepository;
	
	@Autowired
	@Qualifier(value = "pendingRepo")
	Pending pendingRepo;
	
	@Autowired
	@Qualifier(value = "blockRepository")
	BlockRepository blockRepository;
	
	
	Inmate inmate = new Inmate();

	/// to find all inmates
	@Override
	public List<Inmate> findAll() {
		// TODO Auto-generated method stub
		return inmateRepository.findAll();
	}
	
	
	///find inmates by id
	//it had me remove @override after implement  InmateServiceImpl methods
	public Inmate findById(int id) {
		// TODO Auto-generated method stub
		
		return inmateRepository.findById(id);
		
	}
	
	//find by room number
	public Inmate findByRoom(int room) {
		
		return inmateRepository.findByRoom(room);
		
	}
	
	///find change status
	@Override
	public List<Inmate> findPending() {
		// TODO Auto-generated method stub
		return inmateRepository.findByChangeStatus(inmate.getStatus().PENDING);
	}
	
	public List<Inmate> findDenied() {
		
		return inmateRepository.findByChangeStatus(inmate.getStatus().DENIED);
	}

	@Override
	public List<Inmate> findApproved() {
		// TODO Auto-generated method stub
		return inmateRepository.findByChangeStatus(inmate.getStatus().APPROVED);
	}
	
	
	
	
	// to update sentence
	// This is going to save the new info and store it in the Pending DB 
	// You can show old inmate and new inmate to decide if you want to approve or deny update
	// Everything besides ID can be changed and added if you need them

	public void updateInmateStatus(int id, Inmate inmate) {
		
		//inmate = findById(id);
		if (inmate != null) {
			
			// Sets the changes to PENDING and sends it to the pendingRepo for approval
			inmate.setStatus(status.PENDING);
			pendingRepo.save(inmate);
		
		}
		
	}
	
	@Override
	public void createInmate(Inmate inmate) {
		// TODO Auto-generated method stub
		
		/*
		 * Start date is automatic End date is chosen in the front
		 */
		inmate.setStartdate(LocalDate.now());		
		inmate.setEnddate(inmate.getEnddate());
	
		// Difference between start and end date for prison term
		LocalDate start = inmate.getStartdate();
		LocalDate end = inmate.getEnddate();
		
		Period period = Period.between(start, end);
		
		inmate.setTerm(period.getYears());
		
		inmateRepository.save(inmate);

	}
	
}

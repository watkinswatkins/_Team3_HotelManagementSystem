package com.revature.p2.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
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
		
		Inmate newInmate = new Inmate();
		
		newInmate.setAuthor(inmate.getAuthor());
		newInmate.setCharge(inmate.getCharge());
		newInmate.setFname(inmate.getFname());
		newInmate.setLname(inmate.getLname());
		newInmate.setNotes(inmate.getNotes());
		newInmate.setRoom(inmate.getRoom());
		newInmate.setStartdate(LocalDateTime.now());		
		newInmate.setEnddate(inmate.getEnddate());
		
		newInmate.setTerm(inmate.getTerm());

		
		
	}
	
	// Setting the author and resolver can be done in frontend
	
//	//find updates by which guard did them
//	@Override
//	public List<Inmate> findByAuthor(int author) {
//		// TODO Auto-generated method stub
//		return inmateRepository.findByAuthor(author);
//	}


	// Done in Pending files
//	@Override
//	public Inmate updateChangeStatus(int id, int status) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	//  Stretch goal
//	@Override
//	public List<Inmate> findBlock(String block) {
//		
//		Inmate in = new Inmate();
//		
//		
//		
//		return null;
//		
//	}
	
//	// Displaying empty rooms 
//	public List findEmpty(String block, int room, int id) {
//		
//		for (String blocks : block) {
//			
//			
//			
//		}
//		
//		
//		
//		return null;
//		
//	}
//	
}

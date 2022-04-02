package com.revature.p2.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.p2.model.Inmate;
import com.revature.p2.repo.InmateRepository;

@Service
public class InmateServiceImpl implements InmateService {

	@Autowired
	InmateRepository inmateRepository;

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
		return inmateRepository.findById(id).get(id);
		
	//find by room number

	}
	///find change status
	@Override
	public List<Inmate> findPending() {
		// TODO Auto-generated method stub
		return inmateRepository.findByChangeStatus(3);
	}
	
	public List<Inmate> findDenied() {
		
		
		return inmateRepository.findByChangeStatus(2);
	}

	@Override
	public List<Inmate> findApproved() {
		// TODO Auto-generated method stub
		return inmateRepository.findByChangeStatus(1);
	}
	///to update sentence
	@PostMapping
	public Inmate updateInmateStatus(int id, int status) {
		Inmate inmate = null;
		inmate = findById(id);
		if (inmate != null) {
			inmate.setStatus(status);
			inmateRepository.save(inmate);
		}
		return inmate;
	}
	//find updates by which guard did them
	@Override
	public List<Inmate> findByAuthor(int author) {
		// TODO Auto-generated method stub
		return inmateRepository.findByAuthor(author);
	}

	@Override
	public Inmate createChange(Inmate i) {
		// TODO Auto-generated method stub
		
		if (i != null) {
			
			i.setStartdate(new Date());
			i.setEnddate(new Date());
			
			// Resolver can't be null or view reimbursements don't show up
			i.setResolver(1);
			i.setStatus(3);
			i.setCharge(1);
			
			inmateRepository.save(i);
			
		}
		
		return i;
	}
	@Override
	public Inmate updateChangeStatus(int id, int status) {
		// TODO Auto-generated method stub
		return null;
	}
//	@Override
//	public Inmate createChange(Inmate i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public Inmate createInmate(Inmate i) {
		// TODO Auto-generated method stub
		return null;
	}
}

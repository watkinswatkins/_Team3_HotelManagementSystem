package com.revature.p2.service;

import java.util.List;

import com.revature.p2.model.Block.block;
import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Pending;

public interface InmateService {
	// list all inmate
	public List<Inmate> findAll();

	// find inmate by id
	public Inmate findById(int id);

	public List<Inmate> findStatus(status status);

	public Inmate createInmate(Inmate inmate);

	public Inmate findByRoom(int room);

	public Inmate updateInmateStatus(int id, Inmate inmate);

//	//find change status pending
//	public List<Inmate> findPending();
//	//find change status denied
//	public List<Inmate> findDenied();
//	//find change status approved
//	public List<Inmate> findApproved();
//	

//	// Find all inmates under a specific BLOCK
//	public List<Inmate> findBlock(block block);

	// for warden to approve or deny prison sentence length changes
	// public Inmate updateChangeStatus(int id, int status);

	// for guards to create sentence changes
	// public Inmate createChange(Inmate i);
	// find status changes by guard id
	// public List<Inmate> findByAuthor(int author);
	// create an inmate
}

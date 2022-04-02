package com.revature.p2.service;

import java.util.List;

import com.revature.p2.model.Inmate;

public interface InmateService {
	//list all inmate
	public List<Inmate> findAll();
	//find inmate by id
	public static Inmate findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	//find change status pending
	public List<Inmate> findPending();
	//find change status denied
	public List<Inmate> findDenied();
	//find change status approved
	public List<Inmate> findApproved();
	//for guards to create sentence changes
	public Inmate createChange(Inmate i);
	//find status changes by guard id
	public List<Inmate> findByAuthor(int author);
	//create an inmate
	public Inmate createInmate(Inmate i);
	//for warden to approve or deny prison sentence length changes
	public Inmate updateChangeStatus(int id,int status);
	

	
	
}

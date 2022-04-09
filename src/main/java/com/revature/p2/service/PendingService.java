package com.revature.p2.service;

import java.util.List;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Pending;

public interface PendingService {
	
	public List<Pending> findByStatus(status status);
	
	public List<Pending> findAllStatus();
	
	public Inmate updateChanges(int id, Inmate inmate);

}

package com.revature.p2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Pending;

@Repository
public interface PendingRepository extends JpaRepository<Pending, Integer> {

	public List<Pending> findByStatus(status status);
	
	public List<Pending> findAllStatus();
	
	public Inmate updateChanges(int id, Inmate inmate);
}

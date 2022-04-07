package com.revature.p2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;

@Repository
public interface Pending extends JpaRepository<Inmate, Integer> {

	public List<Pending> findByStatus(status status);
	
	public List<Pending> findAllStatus();
	
}

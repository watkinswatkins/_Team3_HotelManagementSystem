package com.revature.p2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Pending;
import com.revature.p2.service.PendingServiceImpl;

@Repository
public interface PendingRepository extends JpaRepository<Pending, Integer> {

	//public List<Pending> findByStatusContaining(String status);
	
}

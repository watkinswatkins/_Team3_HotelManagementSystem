package com.revature.p2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Pending;
//import com.revature.p2.model.Pending.status;
import com.revature.p2.repository.PendingRepository;
import com.revature.p2.service.PendingServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@CrossOrigin(origins = "https//localhost:8095")

public class PendingController {

	@Autowired
	PendingRepository pendingRepository;

	@Autowired
	PendingServiceImpl pendingServiceImpl;

	@GetMapping("/pending")
	public List<Pending> findAll() {

		return pendingRepository.findAll();
		
	}

	// Ask Siva
	@GetMapping("/pending/status/{status}")
	public List<Pending> findStatus(String status) {

		return pendingServiceImpl.findByStatusContaining(status);
		
	}

	@PostMapping("/addPending")
	public Pending addPending(@RequestBody Pending pending) {
		
		return pendingRepository.save(pending);

	}

}

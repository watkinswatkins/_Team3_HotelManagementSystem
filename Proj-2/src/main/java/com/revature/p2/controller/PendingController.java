package com.revature.p2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Pending;
import com.revature.p2.model.Pending.status;
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

@GetMapping("/findByStatus/{status}")
public List<Pending> findStatus(@RequestParam status status){
	
	return pendingServiceImpl.findStatus(status);
}

@PostMapping
public Pending addPending(Pending pending) {
	return pendingServiceImpl.addPending(pending);
	
}
}

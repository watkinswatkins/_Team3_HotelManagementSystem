package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Pending;
import com.revature.p2.service.PendingService;

@RestController
@CrossOrigin(origins="http://localhost:8095")
public class PendingController {

	@Autowired
	PendingService pendingService;
	
	@GetMapping("/status")
	public List<Pending> findByStatus(@RequestParam("status") status status) {
		
		return pendingService.findAllStatus();
		
	}
	
	@GetMapping("/allStatus")
	public List<Pending> findAllStatus() {
		
		return pendingService.findAllStatus();
		
	}
	
	@PutMapping("/updateStatus/{id}/status")
	public Inmate updateChanges(@RequestParam int id, Inmate inmate) {
		
		return pendingService.updateChanges(id, inmate);
		
	}
	
}

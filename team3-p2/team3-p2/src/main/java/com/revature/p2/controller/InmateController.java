package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Pending;
import com.revature.p2.repo.InmateRepository;
import com.revature.p2.service.InmateService;

@RestController
@CrossOrigin(origins="http://localhost:8095")
public class InmateController {
	@Autowired
	InmateService inmateService;

	@GetMapping("/inmate")
	public List<Inmate> findAll() {
		return inmateService.findAll();
	}
	
	@GetMapping("/inmate/{id}")
	public Inmate findById(@PathVariable int id) {
		return inmateService.findById(id);
	}
	
	@GetMapping("/inmate/{room}")
	public Inmate findByRoom(@RequestParam("room") int room) {
		
		return inmateService.findByRoom(room);
		
	}
	
	@GetMapping("/inmate/status")
	public List<Inmate> findPending(@RequestParam("status") status status) {
		
		return inmateService.findStatus(status);
		
	}
	
	
	@PutMapping("/inmate/{id}")
	public Inmate updateInmateStatus(@PathVariable int id, @RequestBody Inmate inmate) {
		
		return inmateService.updateInmateStatus(id, inmate);// InmateService
		
	}
	
	@PostMapping("/inmate")
	public Inmate createInmate(@RequestBody Inmate i) {
		
		return inmateService.createInmate(i);
		
	}
}

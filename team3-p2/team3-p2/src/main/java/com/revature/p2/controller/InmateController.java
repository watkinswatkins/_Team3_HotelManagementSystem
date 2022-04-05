package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Inmate;
import com.revature.p2.service.InmateService;

@RestController
public class InmateController {
	@Autowired
	InmateService inmateService;

	@GetMapping("/inmate")
	public List<Inmate> getAllInmate() {
		return inmateService.findAll();
	}
	
	@GetMapping("/inmate/{id}")
	public Inmate getInmateById(@PathVariable int id) {
		return InmateService.findById(id);
	}
	
	@PutMapping("/inmate/{id}")
	public Inmate updateInmate(@PathVariable int id, @RequestBody int status) {
		return inmateService.updateChangeStatus(id, status);// InmateService
	}
	
	@GetMapping("/users/{authorId}/inmate")
	public List<Inmate> getInmateByUser(@PathVariable int authorId) {
		return inmateService.findByAuthor(authorId);
	}
	
	@PostMapping("/inmate")
	public Inmate addInmate(@RequestBody Inmate i) {
		
		return inmateService.createInmate(i);
		
	}
}

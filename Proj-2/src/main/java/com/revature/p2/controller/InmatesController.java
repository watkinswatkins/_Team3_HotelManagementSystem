package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Block;
import com.revature.p2.model.Inmates;
import com.revature.p2.repository.InmatesRepository;
import com.revature.p2.service.InmatesServiceImpl;

@RestController
//@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class InmatesController {

	@Autowired
	private InmatesRepository inmatesService;
	
	@Autowired
	private InmatesServiceImpl serviceImp;
	
	@GetMapping("/inmates")
	public List<Inmates> findAll() {
		
		return serviceImp.findAll();
		
	}
	
	@GetMapping("/inmates/{id}")
	public Inmates findById(@PathVariable int id) {
		
		return serviceImp.findById(id);
		
	}
	
	@GetMapping("/inmates/findByRoom/{room}")
	public Inmates findByRoom(@PathVariable int room) {
		
		return serviceImp.findByRoom(room);
		
	}
	
	// Does not work right now, try using createInmate to update
	
	//@RequestMapping(value = "/inmates/updateInmate", method=RequestMethod.PUT)
	@PutMapping("/inmates/updateInmate")
	public void updateInmate(@RequestBody Inmates inmate) {
		
		serviceImp.updateInmate(inmate);
		
	}
	
	@PostMapping("/inmates/createInmate")
	public Inmates createInmate(@RequestBody Inmates inmate) {
		
		return inmatesService.save(inmate);
		
	}
	
	@DeleteMapping("/inmates/deleteInmate/{id}")
	public void deleteInmates(@PathVariable int id) {
		
		serviceImp.deleteInmates(id);
		
	}
	
}

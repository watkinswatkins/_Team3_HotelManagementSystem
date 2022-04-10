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

import com.revature.p2.model.Inmates;
import com.revature.p2.repository.InmatesRepository;
import com.revature.p2.service.InmatesServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InmatesConroller {

	@Autowired
	private InmatesRepository inmatesService;
	
	@Autowired
	private InmatesServiceImpl serviceImp;
	
	@GetMapping("/inmates")
	public List<Inmates> findAll() {
		
		return inmatesService.findAll();
		
	}
	
	@GetMapping("/findById/{id}")
	public Inmates findById(@RequestParam int id) {
		
		return inmatesService.getById(id);
		
	}
	
	@GetMapping("/findByRoom/{room}")
	public Inmates findByRoom(@RequestParam int room) {
		
		return serviceImp.findByRoom(room);
		
	}
	
	@PutMapping("/updateInmate/{id}")
	public Inmates updateInmate(@RequestParam(name="id") int id, @RequestBody Inmates inmate) {
		
		return serviceImp.updateInmate(id, inmate);
		
	}
	
	@PostMapping("/createInmate")
	public Inmates createInmate(@RequestBody Inmates inmate) {
		
		return serviceImp.createInmate(inmate);
		
	}
	
}

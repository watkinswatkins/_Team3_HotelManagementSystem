package com.revature.p2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Inmates;
import com.revature.p2.model.Inmates.status;
import com.revature.p2.repository.InmatesRepository;

@Service
public class InmatesServiceImpl {

	private InmatesRepository inmatesService;
	
	public List<Inmates> findAll() {
		
		return inmatesService.findAll();
		
	}
	
	public Inmates findById(int id) {
		
		return inmatesService.getById(id);
				
	}
	
	public Inmates findByRoom(int room) {
		
		return inmatesService.getById(room);
		
	}
	
	public List<Inmates> findStatus(status status) {
		
		switch (status) {
		
		case PENDING: 
			
			return inmatesService.findStatus(status);
					
		}
		
		return null;
		
	}
	
}

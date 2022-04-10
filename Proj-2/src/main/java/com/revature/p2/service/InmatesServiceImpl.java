package com.revature.p2.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Inmates;
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

		// Brute force method being saved
//		List<Inmates> inmates = findAll();
//		
//		Inmates found = new Inmates();
//		
//		for(Inmates inmate : inmates) {
//			
//			if (inmate.getRoomId() == room) {
//				
//				found = inmate;
//				
//			}
//		}
//
//		return found;
		
		return inmatesService.getById(room);

	}
	
	public Inmates updateInmate(int id, Inmates inmate) {
		
		Inmates oldInmate = findById(id);
		
		oldInmate = inmate;
		
		return inmatesService.save(oldInmate);
		
	}
	
	public Inmates createInmate(Inmates inmate) {
		
		inmate.setStartDate(LocalDate.now());
		inmate.setEndDate(inmate.getEndDate());
		
		LocalDate start = inmate.getStartDate();
		LocalDate end = inmate.getEndDate();
		
		Period period = Period.between(start, end);
		
		inmate.setYears(period.getYears());
		inmate.setMonth(period.getMonths());
		
		return inmatesService.save(inmate);
		
	}

}

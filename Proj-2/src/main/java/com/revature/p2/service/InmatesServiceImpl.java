package com.revature.p2.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.model.Inmates;
import com.revature.p2.repository.BlockRepository;
import com.revature.p2.repository.InmatesRepository;
import com.revature.p2.repository.PendingRepository;

@Service
public class InmatesServiceImpl {

	@Autowired
	private InmatesRepository inmatesService;

//	@Autowired
//	private BlockRepository blockRepository;
//
//	@Autowired
//	private BlockServiceImpl blockService;
	

	public List<Inmates> findAll() {

		return inmatesService.findAll();

	}

	public Inmates findById(int id) {
		
		return inmatesService.findById(id).get();

	}

	public Inmates findByRoom(int room) {

		// Brute force method being saved
		List<Inmates> inmates = findAll();
		
		Inmates found = new Inmates();
		
		for(Inmates inmate : inmates) {
			
			if (inmate.getRoomId() == room) {
				
				found = inmate;
				
			}
		}

		return found;

		//return inmatesService.getById(room);

	}

	public void updateInmate(Inmates inmate) {

//		Inmates oldInmate = inmatesService.getById(inmate.getId());
//
//		Block block = blockService.getInmateRoomId(oldInmate.getRoomId());
//
//		block.setInmateId(1);
//
//		Block blck = blockService.getInmateRoomId(inmate.getRoomId());
//
//		blck.setInmateId(inmate.getId());

		inmatesService.save(inmate);

	}

	public Inmates createInmate(Inmates inmate) {
		
//		inmate.setStartDate(LocalDate.now());
//		inmate.setEndDate(inmate.getEndDate());
//
//		LocalDate start = inmate.getStartDate();
//		LocalDate end = inmate.getEndDate();
//
//		Period period = Period.between(start, end);
//
//		inmate.setYears(period.getYears());
//		inmate.setMonth(period.getMonths());

		return inmatesService.save(inmate);

	}

	public void deleteInmates(int id) {
		// TODO Auto-generated method stub
		inmatesService.deleteById(id);
	}

}

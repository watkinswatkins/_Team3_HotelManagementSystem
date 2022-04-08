package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.repo.BlockRepository;

@Service
public class BlockServiceImpl implements BlockService{

	
	@Autowired
	@Qualifier(value = "blockRepository")
	BlockRepository blockRepository;
	
	@Override
	public List findEmpty() {
		
		
		List<Block> rooms = blockRepository.findAll();
		
		List<Block> roomEmpty = new ArrayList<Block>();
		
		for (Block room : rooms) {
			
			int roomFull = room.getInmateId();
			
			int nul = (Integer) null;
			
			if(roomFull == nul) {
				
				roomEmpty.add(room);
				
			}
			
		}
		
		return roomEmpty;
			
		}

}

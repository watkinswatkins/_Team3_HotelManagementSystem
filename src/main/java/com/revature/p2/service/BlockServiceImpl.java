package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.model.Block.block;
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
			
			Integer roomFull = room.getInmateId();
			
//			int nul = (Integer) null;
//			
			if(roomFull.equals(null)) {
				
				roomEmpty.add(room);
				
			}
			
		}
		
		return roomEmpty;
			
		}
	
	@Override
	public List findBlock(block block) {
		
		List<Block> blocks = blockRepository.findAll();
		
		List<Block> allInmates = new ArrayList<Block>();
		
		for (Block b : blocks) {
			
			if (b.getBlock().equals(block)) {
				
				allInmates.add(b);
				
			}
			
		}
		
		return allInmates;
		
	}

}

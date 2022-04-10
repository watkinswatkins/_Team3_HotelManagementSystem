package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.model.Block.block;
import com.revature.p2.repository.BlockRepository;

@Service
public class BlockServiceImpl {

	private BlockRepository blockService;
	
	public List<Block> findByBlock(Block block) {
		
		List<Block> blocks = findAll();
		
		List<Block> rooms = new ArrayList<>();
		
		for (Block bloc : blocks) {
			
			if(bloc.getBlockNumber().equals(block.getBlockNumber())) {
				
				rooms.add(bloc);
				
			}
			
		}
		
		return rooms;
		
	}
	
	public List<Block> findAll() {
		
		return blockService.findAll();
		
	}
	
}

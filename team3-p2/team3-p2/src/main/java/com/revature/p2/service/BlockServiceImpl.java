package com.revature.p2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.repository.BlockRepository;

@Service
public class BlockServiceImpl {

	private BlockRepository blockService;
	
	public List<Block> findByBlock(Block block) {
		
		return blockService.findByBlock(block);
		
	}
	
	public List<Block> findAll() {
		
		return blockService.findAll();
		
	}
	
}

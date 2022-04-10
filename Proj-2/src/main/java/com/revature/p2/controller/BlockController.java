package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Block;
import com.revature.p2.model.Block.block;
import com.revature.p2.service.BlockServiceImpl;

@RestController
@CrossOrigin(origins = "https//localhost:8095")
public class BlockController {

	@Autowired
	BlockServiceImpl blockService;
	
	@GetMapping("/block")
	public List<Block> findByBlock(Block block) {
		
		return blockService.findByBlock(block);
		
	}
	
	@GetMapping("/blocks")
	public List<Block> findAll() {
		
		return blockService.findAll();
		
	}
	
}

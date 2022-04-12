package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Block;
//import com.revature.p2.model.Block.block;
import com.revature.p2.service.BlockServiceImpl;

@RestController
@CrossOrigin(origins = "https//localhost:4200")
public class BlockController {

	@Autowired
	BlockServiceImpl blockService;
	
	@GetMapping("/blocks/block/{block}")
	public List<Block> findByBlock(@PathVariable String block) {
		
		return blockService.findByBlock(block);
		
	}
	
	@GetMapping("/blocks")
	public List<Block> findAll() {
		
		return blockService.findAll();
		
	}
	
	@PutMapping("/blocks/updateBlock") 
	public void updateBlock(@RequestBody Block block) {
		
		blockService.updateBlock(block);
		
	}
	
}

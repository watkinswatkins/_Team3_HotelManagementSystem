package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Block.block;
import com.revature.p2.service.BlockService;

@RestController
@CrossOrigin(origins="https//localhost:8095")
public class BlockController {

	@Autowired
	BlockService blockService;
	
	@GetMapping("/rooms")
	public List findEmpty() {
		
		return blockService.findEmpty();
		
	}
	
	@GetMapping("/blocks")
	public List findBlock(@RequestParam("block") block block) {
		
		return blockService.findBlock(block);
		
	}
	
}

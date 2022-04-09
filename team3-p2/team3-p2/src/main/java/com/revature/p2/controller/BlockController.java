package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.service.BlockService;

@RestController
@CrossOrigin(origins="https//localhost:8095")
public class BlockController {

	@Autowired
	BlockService blockService;
	
	
	public List findEmpty() {
		
		return blockService.findEmpty();
		
	}
	
}

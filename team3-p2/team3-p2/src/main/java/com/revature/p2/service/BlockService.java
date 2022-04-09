package com.revature.p2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.p2.model.Block.block;
import com.revature.p2.repo.BlockRepository;

public interface BlockService {

	public List findEmpty();
	
	public List findBlock(block block);
	
}

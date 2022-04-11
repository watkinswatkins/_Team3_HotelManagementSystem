package com.revature.p2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Block;
import com.revature.p2.model.Inmates;
//import com.revature.p2.model.Block.block;
import com.revature.p2.repository.BlockRepository;

@Service
public class BlockServiceImpl {

	@Autowired
	private BlockRepository blockService;

	public List<Block> findByBlock(String block) {

		List<Block> blocks = findAll();
		
		List<Block> rooms = new ArrayList<>();

		for (Block bloc : blocks) {

			String num = block;
			String num2 = bloc.getBlockNumber();

//			if(bloc.getBlockNumber().equals(block.getBlockNumber())) {

			if (num.equalsIgnoreCase(num2)) {

				rooms.add(bloc);

			}

		}

		return rooms;

	}

	public List<Block> findAll() {

		return blockService.findAll();

	}

	public Block getInmateRoomId(int id) {

		return blockService.getById(id);

	}

}

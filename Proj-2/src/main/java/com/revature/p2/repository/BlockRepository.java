package com.revature.p2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Block;
//import com.revature.p2.model.Block.block;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer> {

	//public List<Block> findByBlockContaining(String block);
	
}

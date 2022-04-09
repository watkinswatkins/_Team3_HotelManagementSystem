package com.revature.p2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Block;
import com.revature.p2.model.Inmate;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer>{

}

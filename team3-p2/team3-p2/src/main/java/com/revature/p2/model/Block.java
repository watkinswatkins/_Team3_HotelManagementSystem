package com.revature.p2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Block {

	public enum block {

		ONE, TWO, THREE, FOUR, FIVE, SIX

	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int room;
	public Block block;
	public int inmateId;
	
	public Block(int room, Block block, int inmateId) {
		super();
		this.room = room;
		this.block = block;
		this.inmateId = inmateId;
	}

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

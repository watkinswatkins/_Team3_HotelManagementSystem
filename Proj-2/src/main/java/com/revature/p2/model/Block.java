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
	private int id;
	private block blockNumber;
	private int roomId;

	public Block(int id, block blockNumber, int roomId) {
		super();
		this.id = id;
		this.blockNumber = blockNumber;
		this.roomId = roomId;
	}

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

}

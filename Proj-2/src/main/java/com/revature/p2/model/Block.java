package com.revature.p2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Block {

//	public enum block {
//
//		ONE, TWO, THREE, FOUR, FIVE, SIX
//
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roomid;
	private String blockNumber;
	private Integer inmateId;

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Block(int roomid, String blockNumber, Integer inmateId) {
		super();
		this.roomid = roomid;
		this.blockNumber = blockNumber;
		this.inmateId = inmateId;
	}

}

package com.revature.p2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	//@OneToOne
	//@JoinColumn(name="roomId")
	private Inmates roomId;
	
}

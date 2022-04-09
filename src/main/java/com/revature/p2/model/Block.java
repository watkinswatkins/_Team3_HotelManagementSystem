package com.revature.p2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "Block")
public class Block {

	public enum block {

		ONE, TWO, THREE, FOUR, FIVE, SIX

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "room")
	public int room;
	@Enumerated(EnumType.STRING)
	@Column(name = "block")
//	@OneToMany(targetEntity = Inmate.class, mappedBy="block", fetch=FetchType.EAGER)
	public block block;
	@Column(name = "inmateId")
	public int inmateId;

	public Block(int room, block block, int inmateId) {
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

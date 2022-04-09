package com.revature.p2.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Block.block;


import lombok.Data;

/*
This class works the same as Inmate
When any change is made to an Inmate, their status will be automatically set to Pending 
And a copy of their info gets stored in this database
This should be accessed when approving or denying inmates
If approved, the information updates in Inmate database, if denied it stays
It's like a reciept, you will probably need to filter out by PENDING status when approving
I don't know if it deletes it from this database if it's approved
*/

@Data
@Entity
@Table(name = "Pending")
public class Pending {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "fname")
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "room")
	private int room;
	@Enumerated(EnumType.STRING)
	@Column(name = "block")
	private block block;
	@Column(name = "startdate")
	private LocalDate startdate;
	@Column(name = "enddate")
	private LocalDate enddate;
	@Column(name = "term")
	private int term;
	@Column(name = "charge")
	private String charge;
	@Column(name = "notes")
	private String notes;
	@Column(name = "status")
	private status status;
	@Column(name = "author")
	private int author;
	@Column(name = "resolver")
	private int resolver;

	public Pending(int id, String fname, String lname, int room, block block, LocalDate startdate, LocalDate enddate,
			int term, String charge, String notes, com.revature.p2.model.Inmate.status status, int author,
			int resolver) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.room = room;
		this.block = block;
		this.startdate = startdate;
		this.enddate = enddate;
		this.term = term;
		this.charge = charge;
		this.notes = notes;
		this.status = status;
		this.author = author;
		this.resolver = resolver;
	}

	public Pending() {
		super();
		// TODO Auto-generated constructor stub
	}

}

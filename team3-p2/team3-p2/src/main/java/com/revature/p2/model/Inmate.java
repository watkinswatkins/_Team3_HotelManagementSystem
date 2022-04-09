package com.revature.p2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@Table(name = "Inmate")
public class Inmate {

	public enum status {

		PENDING, APPROVED, DENIED
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private int room;
	private Block block;
	private LocalDate startdate;
	private LocalDate enddate;
	private int term;
	private String charge;
	private String notes;
	private status status;
	private int author;
	private int resolver;
	
	public Inmate(int id, String fname, String lname, int room,
			Block block, LocalDate startdate,
			LocalDate enddate, int term, String charge, String notes, status role, int author, int resolver) {
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

	public Inmate() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package com.revature.p2.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
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

import lombok.Data;

import com.revature.p2.model.Block.block;

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
//	@ManyToOne(targetEntity=Block.class, fetch=FetchType.EAGER)
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
	@Enumerated(EnumType.ORDINAL)
	private status status;
	@Column(name = "author")
	private int author;
	@Column(name = "resolver")
	private int resolver;

	public Inmate(int id, String fname, String lname, int room, block block, LocalDate startdate, LocalDate enddate,
			int term, String charge, String notes, status role, int author, int resolver) {
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

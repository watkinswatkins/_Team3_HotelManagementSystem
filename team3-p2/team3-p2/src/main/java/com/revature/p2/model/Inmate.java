package com.revature.p2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "inmate")
public class Inmate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "inmate_id")
	private int id;
	@Column (name = "first_name")
	private String fname;
	@Column (name = "last_name")
	private String lname;
	@Column (name = "room_number")
	private int room;
	@Column (name = "sentence_start")
	private Date startdate;
	@Column (name = "sentence_end")
	private Date enddate;
	@Column (name = "charge")
	private int charge;
	@Column (name = "notes")
	private String notes;
	@Column (name = "change_status")
	private int status;
	@Column (name = "change_author")
	private int author;
	@Column (name = "change_resolver")
	private int resolver;

	public Inmate(int id, String fname, String lname, int room, Date startdate, 
			Date enddate, int charge, String notes, int status, int author, int resolver) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.room = room;
		this.startdate = startdate;
		this.enddate = enddate;
		this.charge = charge;
		this.notes = notes;
		this.status = status;
		this.author = author;
		this.resolver = resolver;
	}

	public Inmate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public Date startDate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date endDate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}
	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}


}

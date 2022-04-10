package com.revature.p2.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Inmates {

//	public enum status {
//
//		PENDING, APPROVED, DENIED
//
//	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int roomId;
	private String firstName;
	private String lastName;
	private String charge;
	private String notes;
//	private status status;
	private LocalDate startDate;
	private LocalDate endDate;
	private int month;
	private int years;

	public Inmates(int id, int roomId, String firstName, String lastName, String charge, String notes,
			/*status status, */ LocalDate startDate, LocalDate endDate, int month, int years) {
		super();
		this.id = id;
		this.roomId = roomId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.charge = charge;
		this.notes = notes;
	//	this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.month = month;
		this.years = years;
	}

	public Inmates() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package com.revature.p2.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
public class Inmates {

	public enum status {
		
		PENDING, APPROVED, DENIED

	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roomId")
	private Block room;
	private String firstName;
	private String lastName;
	private String charge;
	private String notes;
	private status status;
	
}

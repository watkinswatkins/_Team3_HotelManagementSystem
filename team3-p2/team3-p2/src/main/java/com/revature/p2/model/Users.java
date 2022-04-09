package com.revature.p2.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class Users {

	public enum pjob {

		WARDEN, GUARD

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private pjob role;
	private Boolean guard;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String username, String password, String firstName, String lastName, pjob role, Boolean guard) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.guard = guard;
	}

}

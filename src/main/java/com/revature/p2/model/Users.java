package com.revature.p2.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class Users {

	public enum pjob {

		WARDEN, GUARD

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "role")
	private pjob role;
	@Column(name = "guard")
	private Boolean guard;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String username, String password, String firstName, String lastName, pjob role,
			Boolean guard) {
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

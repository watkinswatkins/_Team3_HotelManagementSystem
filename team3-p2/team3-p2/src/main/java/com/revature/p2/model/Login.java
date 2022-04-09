package com.revature.p2.model;

import com.revature.p2.model.Users.pjob;

import lombok.Data;

@Data
public class Login {

	private String username;
	private String password;

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;

	}

	public Login() {
		super();
	}

}

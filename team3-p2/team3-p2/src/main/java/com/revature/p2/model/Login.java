package com.revature.p2.model;

import com.revature.p2.model.Users.pjob;

public class Login {

	// Come back for login by role
	
	private String username;
	private String password;
//	private pjob role;

	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	//	this.role = role;
	}

	public Login() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
//	public void setRole(pjob role) {
//		
//		this.role = role;
//		
//	}
//	public pjob getRole() {
//		
//		return role;
//		
//	}

}

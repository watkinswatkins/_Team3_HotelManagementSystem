package com.revature.p2.service;

import java.util.List;

import com.revature.p2.model.Users;
import com.revature.p2.model.Users.pjob;

public interface UsersService {
	
	public Users userLogin(String username, String password);
	public Users userLogout();
	
	public Users viewUser (String username);
	public Users updateUser(int id, Users users);
	
	public List<Users> findAll();

}

package com.revature.p2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2.model.Users;
import com.revature.p2.repository.UsersRepository;

@Service
public class UsersServiceImpl {
	
	@Autowired
	private UsersRepository usersService;
	
//	public UsersServiceImpl(UsersRepository usersService) {
//		
//		this.usersService = usersService;
//		
//	}
	
	public Users userLogin(String username, String password) {
		
		return usersService.getUserByUsernameAndPassword(username, password);
		
	}
	
	public List<Users> findAll() {
		
		return usersService.findAll();
	}
	
	public Users createUser(Users user) {
		
		return usersService.save(user);
		
	}


}
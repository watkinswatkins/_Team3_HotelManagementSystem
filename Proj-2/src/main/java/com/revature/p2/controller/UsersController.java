package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Users;
import com.revature.p2.repository.UsersRepository;
import com.revature.p2.service.UsersServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsersController {
	
//	@Autowired
//	private UsersRepository usersRepository;

	@Autowired
	private UsersServiceImpl userService;
	
	@GetMapping("/users")
	public List<Users> getUsers(){ 
//		
//		return (List<Users>) usersRepository.findAll();
//
		return userService.findAll();
		
	}
	
	@PostMapping("/users/addUser")
	public void addUser(@RequestBody Users user) {
		
//		usersRepository.save(user);
//		
		userService.createUser(user);
		
	}
	
}
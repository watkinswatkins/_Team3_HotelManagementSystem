package com.revature.p2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Users;
import com.revature.p2.service.UsersService;

@RestController
//Should we have a @CrossOrigin?
/*
 * This sends it to this port(8095) and Angular pulls the data from that port and
 * sends it through it's own port(4200 or whatever you set it to)
 */
@CrossOrigin(origins = "http://localhost:8095")

public class UserController {
	@Autowired
	UsersService userService;
	
	@GetMapping("/login")
	public Users userLogin(String username, String password) {
		
		
		return userService.userLogin(username, password);
		
	}
	
	@GetMapping("/logout")
	public Users userLogout() {
		
		return userService.userLogout();
		
	}

	@GetMapping("/users/{username}")
	public Users viewUser(@RequestParam("username") String username) {
		return userService.viewUser(username);
	}


	@PutMapping("/users")
	public Users updateUser(@RequestBody Users u) {

		return userService.updateUser(u.getId(), u);
	}
	
	@GetMapping("/allUsers")
	public List<Users> findAll() {
		
		return userService.findAll();
		
	}
	
}

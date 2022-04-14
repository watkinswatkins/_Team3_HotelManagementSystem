package com.revature.p2.controller;

import java.nio.file.AccessDeniedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Login;
import com.revature.p2.model.Users;
import com.revature.p2.service.UsersServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

//	@Autowired
//	UsersService userService;

	@Autowired
	private UsersServiceImpl userService;
	
	@PostMapping("/users/login")
	public Users checkLogin(@RequestBody Login login) throws AccessDeniedException {
		
		// Come back for role logins 
		
		Users u = userService.userLogin(login.getUsername(), login.getPassword());
		
		if(u == null) {
			
		throw new AccessDeniedException("403 returned");
		
		}
		
		return u;
		
	}
	
}

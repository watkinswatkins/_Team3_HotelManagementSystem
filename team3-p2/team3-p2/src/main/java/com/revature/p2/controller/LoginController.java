package com.revature.p2.controller;

import java.nio.file.AccessDeniedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2.model.Login;
import com.revature.p2.model.Users;
import com.revature.p2.service.UsersService;

@RestController
public class LoginController {

	@Autowired
	UsersService userService;

	@PostMapping("/users/login")
	public Users checkLogin(@RequestBody Login login) throws AccessDeniedException {
		
		Users u = userService.userLogin(login.getUsername(), login.getPassword());
		
		if(u == null) {
			
		throw new AccessDeniedException("403 returned");
		}
		
		return u;
		
	}
	
}

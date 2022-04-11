package com.revature.p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	public Users getUserByUsernameAndPassword(String username, String Password);
	
}
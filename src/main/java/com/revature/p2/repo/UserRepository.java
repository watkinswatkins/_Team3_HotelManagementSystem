package com.revature.p2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Users;

///Should we be doing CrudRepository instead of JpaRepository?
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	
	public Users getUserByUsernameAndPassword(String username,String password);
	public Users userLogout();
	public Users viewUser(String username);
	public Users updateUser(int id, Users users);
	
//	public Users getUserByUsername(String username);
	
}

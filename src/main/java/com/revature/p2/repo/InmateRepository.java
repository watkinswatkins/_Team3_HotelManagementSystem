package com.revature.p2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Inmate;
import com.revature.p2.model.Inmate.status;

///Should we be doing CrudRepository instead of JpaRepository?
@Repository
public interface InmateRepository extends JpaRepository<Inmate, Integer> {

	public Inmate findById(int id);
	
	public Inmate findByRoom(int roomNumber);

	public List<Inmate> findByChangeStatus(status status);
	
//	public List<Inmate> findByAuthor(int author);

}

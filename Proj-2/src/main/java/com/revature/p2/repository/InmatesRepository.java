package com.revature.p2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p2.model.Inmates;


@Repository
public interface InmatesRepository extends JpaRepository<Inmates, Integer> {

//	public List<Inmates> findAll();
//	public Inmates findByRoom(int room);
//	public List<Inmates> findStatus(status status);
	
}

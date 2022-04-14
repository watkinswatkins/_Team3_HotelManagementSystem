package com.revature.p2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p2.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

	Optional<Image> findByName(String name);
	
}

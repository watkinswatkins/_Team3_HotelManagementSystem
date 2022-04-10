package com.revature.p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.p2.model.Pending;

public interface PendingRepository  extends JpaRepository<Pending, Integer> {

}

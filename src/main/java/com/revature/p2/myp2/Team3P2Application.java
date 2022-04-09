package com.revature.p2.myp2;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.revature.p2.controller.InmateController;
import com.revature.p2.model.Block.block;
import com.revature.p2.model.Inmate.status;
import com.revature.p2.model.Inmate;
import com.revature.p2.model.Users;
import com.revature.p2.model.Users.pjob;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = { "com.revature.p2.model" })
public class Team3P2Application {

	public static void main(String[] args) {
		SpringApplication.run(Team3P2Application.class, args);

		Inmate inmate = new Inmate();
		//InmateController ic = new InmateController();
		
		inmate.setId(0);
		inmate.setFname("Test");
		inmate.setLname("Test");
		inmate.setRoom(1);
		inmate.setBlock(block.ONE);
		inmate.setEnddate(LocalDate.now());
		inmate.setCharge("Battery");
		inmate.setNotes("A salt");
		inmate.setStatus(status.APPROVED);
		inmate.setAuthor(1);
		inmate.setResolver(1);
		
		//ic.createInmate(inmate);
		
	}

}

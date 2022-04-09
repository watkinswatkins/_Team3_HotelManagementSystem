package com.revature.p2.myp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.revature.p2.model.Users;
import com.revature.p2.model.Users.pjob;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = { "com.revature.p2.model" })
public class Team3P2Application {

	public static void main(String[] args) {
		SpringApplication.run(Team3P2Application.class, args);

		Users warden = new Users();

		warden.setFirstName("TestFirst");
		warden.setLastName("TestLast");
		warden.setUsername("Warden");
		warden.setPassword("password");
		warden.setRole(pjob.WARDEN);

	}

}

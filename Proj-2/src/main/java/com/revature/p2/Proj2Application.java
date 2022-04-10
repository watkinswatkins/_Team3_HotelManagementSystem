package com.revature.p2;

import java.util.stream.Stream;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.p2.model.Users;
import com.revature.p2.repository.InmatesRepository;
import com.revature.p2.repository.UsersRepository;

@SpringBootApplication
public class Proj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj2Application.class, args);

	}

	@Bean
	CommandLineRunner init(UsersRepository usersRepository) {

		return args -> {

			Stream.of("Test1", "Test2", "Test3").forEach(username -> {

				Users user = new Users();

				user.setUsername(username);
				user.setPassword("TestPass");
				user.setFirstName(username);
				user.setLastName("LastName");
				usersRepository.save(user);

			});

			usersRepository.findAll().forEach(System.out::println);
			
		};

	}
	
//	@Bean
//	CommandLineRunner init(InmatesRepository inmatesRepository) {
//		
//		return args -> { 
//			
//			Stream.of("Inmate1", "Inmate2", "Inmate3").
//		}
//		
//	}
}

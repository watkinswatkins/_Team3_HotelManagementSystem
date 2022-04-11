package com.revature.p2;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revature.p2.model.Block;
import com.revature.p2.model.Inmates;
import com.revature.p2.model.Users;
import com.revature.p2.repository.BlockRepository;
import com.revature.p2.repository.InmatesRepository;
import com.revature.p2.repository.UsersRepository;
import com.revature.p2.service.InmatesServiceImpl;

@SpringBootApplication
public class Proj2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Proj2Application.class, args);
//		
//		InmatesServiceImpl inmatesService = new InmatesServiceImpl();
//		
//		int five = 5;
//		
//		Inmates inmate = inmatesService.findById(five);
//
//		inmate.setStartDate(LocalDate.now());
//		inmate.setEndDate(LocalDate.of(2032, 3, 15));
//
//		inmate.setNotes("Drunk driving");
//		inmate.setRoomId(102);
//
//		inmatesService.updateInmate(five, inmate);

	}

//	@Bean
//	CommandLineRunner init(UsersRepository usersRepository) {
//
//		return args -> {
//
//			Stream.of("Test1", "Test2", "Test3").forEach(username -> {
//
//				Users user = new Users();
//
//				user.setUsername(username);
//				user.setPassword("TestPass");
//				user.setFirstName(username);
//				user.setLastName("LastName");
//				usersRepository.save(user);
//
//			});
//
//			usersRepository.findAll().forEach(System.out::println);
//			
//		};
//
//	}
//	
//	@Bean
//	CommandLineRunner init1(InmatesRepository inmatesRepository) {
//		
//		return args -> { 
//			
//			Stream.of("Inmate1", "Inmate2", "Inmate3").forEach(username -> {
//				
//				Inmates inmate = new Inmates();
//				
//				inmate.setFirstName(username);
//				inmate.setLastName(username + " Last");
//				inmate.setCharge("Assault");
//				inmate.setNotes("Sentenced to solitary confinement");
//				inmate.setEndDate(LocalDate.now());
//				inmatesRepository.save(inmate);
//				
//			});
//			
//			inmatesRepository.findAll().forEach(System.out::println);
//			
//		};
//		
//	}

}

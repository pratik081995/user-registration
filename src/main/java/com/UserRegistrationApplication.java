package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.model.User;
import com.repository.UserRepository;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			User user1 = new User();
			user1.setFirstName("Pratik");
			user1.setLastName("Pawar");
			user1.setEmail("pratik@gmail.com");
			user1.setCity("Mumbai");
			user1.setMobileNumber("9869405256");
			userRepository.save(user1);

			User user2 = new User();
			user2.setFirstName("Tony");
			user2.setLastName("Stark");
			user2.setEmail("tony@gmail.com");
			user2.setCity("New York");
			user2.setMobileNumber("768732152");
			userRepository.save(user2);
		};
	}
}
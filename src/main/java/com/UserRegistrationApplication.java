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
			User user1 = User.builder().firstName("Pratik").lastName("Pawar").email("pratik@gmail.com").city("Mumbai")
					.mobileNumber("9869405256").build();
			userRepository.save(user1);

			User user2 = User.builder().firstName("John").lastName("Wick").email("john@gmail.com").city("New York")
					.mobileNumber("985263182").build();
			userRepository.save(user2);
		};
	}
}
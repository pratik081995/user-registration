package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.model.Order;
import com.model.User;
import com.repository.OrderRepository;
import com.repository.UserRepository;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository userRepository,OrderRepository orderRepository) {
		return args -> {
			User user1 = User.builder().firstName("Pratik").lastName("Pawar").email("pratik@gmail.com").city("Mumbai")
					.mobileNumber("9869405256").age("24").build();
			userRepository.save(user1);

			User user2 = User.builder().firstName("John").lastName("Wick").email("john@gmail.com").city("New York")
					.mobileNumber("985263182").age("28").build();
			userRepository.save(user2);
		
			Order order1 = Order.builder().name("Speaker").quantity("10").price("2000").build();
				orderRepository.save(order1);

				Order order2 = Order.builder().name("TV").quantity("12").price("50000").build();
				orderRepository.save(order2);

			};
		}
	}

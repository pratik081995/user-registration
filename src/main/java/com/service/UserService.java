package com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ResourceNotFoundException;
import com.model.User;
import com.repository.UserRepository;;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(int id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(int id, User newUser) {

		return userRepository.findById(id).map(user -> {
			user.setFirstName(newUser.getFirstName());
			user.setLastName(newUser.getLastName());
			user.setEmail(newUser.getEmail());
			user.setCity(newUser.getCity());
			user.setAge(newUser.getAge());
			user.setMobileNumber(newUser.getMobileNumber());
			return userRepository.save(user);
		}).orElseGet(() -> {
			newUser.setId(id);
			return userRepository.save(newUser);
		});
	}

	public void deleteUser(int id) {
		(userRepository.findById(id)).orElseThrow(() -> new ResourceNotFoundException(id));
		userRepository.deleteById(id);

//		if (userRepository.findById(id).isPresent()) {
//			userRepository.deleteById(id);
//		} else {
//			Optional.empty();
//		}
	}

	public List<User> findByFirstName(String fname) {
		if (!userRepository.findByFirstNameIgnoreCase(fname).isEmpty())
			return userRepository.findByFirstNameIgnoreCase(fname);
		else {
			throw new ResourceNotFoundException(fname);
		}
	}

	public List<User> findByCityName(String city) {
		return userRepository.findByCityContainingIgnoreCase(city);
	}

	public List<User> findByCityAndAge(String city, String age) {
		return userRepository.findByCityandAge(city, age);
	}
}

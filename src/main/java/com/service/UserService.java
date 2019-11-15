package com.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().collect(Collectors.toList());
	}

	public Optional<User> getUser(int id) {
		if (userRepository.findById(id).isPresent())
			return userRepository.findById(id);
		else
			return Optional.empty();
	}

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(int id, User user) throws Exception {
		Optional<User> user1 = userRepository.findById(id);
		if (user1.isPresent()) {
			return userRepository.save(user);
		} else {
			throw new Exception("User not found for this id : " + id);
		}
	}

	public void deleteUser(int id) {
		if (userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		} else {
			Optional.empty();
		}
	}

	public List<User> findByFirstName(String fname) throws Exception {
		if (!userRepository.findByFirstNameIgnoreCase(fname).isEmpty())
			return userRepository.findByFirstNameIgnoreCase(fname);
		else {
			throw new Exception("User not found with first name : "+ fname);
		}
	}

	public List<User> findByCityName(String city) {
		return userRepository.findByCityContainingIgnoreCase(city);
	}
}

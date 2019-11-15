package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PutMapping("/users/{id}")
	public User update(@PathVariable int id, @RequestBody User user) throws Exception {
		return userService.updateUser(id, user);
	}

	@DeleteMapping(path = "/users/{id}")
	public void delete(@PathVariable int id) {
		userService.deleteUser(id);
	}

	@GetMapping("/users/name/{fname}")
	public List<User> findUserByName(@PathVariable String fname) throws Exception {
		return userService.findByFirstName(fname);
	}

	@GetMapping("/users/city/{city}")
	public List<User> findUserByCityName(@PathVariable String city) {
		return userService.findByCityName(city);
	}
}

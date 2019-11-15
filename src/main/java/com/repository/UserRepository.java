package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


	List<User> findByFirstNameIgnoreCase(String fname);

	List<User> findByCityContainingIgnoreCase(String city);

}

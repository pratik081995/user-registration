package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByFirstNameIgnoreCase(String fname);

	List<User> findByCityContainingIgnoreCase(String city);

	@Query("SELECT u FROM User u  WHERE u.city =:city and u.age =:age")
	List<User> findByCityandAge(@Param("city") String city, @Param("age") String age);

}

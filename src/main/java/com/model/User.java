package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "Users")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	@Column(name = "first_name", nullable = false)
	private String firstName;


	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Getter
	@Setter
	@Column(name = "email_address", nullable = false)
	private String email;

	@Getter
	@Setter
	@Column(name = "city_name", nullable = false)
	private String city;

	@Getter
	@Setter
	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;


}

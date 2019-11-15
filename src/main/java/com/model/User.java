package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Table(name = "Users")
public class User {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Getter
	@Setter
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Getter
	@Setter
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


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

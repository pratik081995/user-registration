package com.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email_address", nullable = false)
	private String email;

	@Column(name = "city_name", nullable = false)
	private String city;

	@Column(name = "age", nullable = false)
	private String age;

	@Column(name = "mobile_number", nullable = false)
	private String mobileNumber;

//	@OneToMany(mappedBy = "user")
//	private List<Order> orders;
}


//	public void addOrder(Order order) {
//        if (!getOrders().contains(order)) {
//        	getOrders().add(order);
//            if (order.getUser() != null) {
//            	order.getUser().getOrders().remove(order);
//            }
//            order.setUser(this);
//        }
//    }
//	
//	public Collection<Order> getOrders() {
//		return orders;
//	}
//}

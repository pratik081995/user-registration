package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.OrderRepository;

public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
}

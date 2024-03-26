package com.example.CustomerService.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.models.Customer;
import com.example.CustomerService.service.CustomerService;

@RestController
@RequestMapping("/api/v2")
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	@Cacheable(value = "customers")
	public List<Customer> getAllCustomer(){
		return service.getAllCustomer();
	}
	@GetMapping("/customer/{id}")
	@Cacheable(key = "#id",value = "customer")
	public Customer getCustomerById(@PathVariable int id) {
		return service.getCustomerById(id);
	}
}

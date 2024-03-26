package com.example.CustomerService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CustomerService.models.Customer;

@Service
public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(int id);
}

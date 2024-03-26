package com.example.CustomerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.CustomerService.models.Customer;
import com.example.CustomerService.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository repository;
	@Override
	public List<Customer> getAllCustomer() {
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return repository.findById(id).get();
	}
	
}

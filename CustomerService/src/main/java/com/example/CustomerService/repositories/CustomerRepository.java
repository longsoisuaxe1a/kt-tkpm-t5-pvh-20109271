package com.example.CustomerService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerService.models.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}

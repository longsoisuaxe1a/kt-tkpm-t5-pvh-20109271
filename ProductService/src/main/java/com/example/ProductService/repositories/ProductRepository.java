package com.example.ProductService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductService.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

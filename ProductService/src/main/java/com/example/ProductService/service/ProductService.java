package com.example.ProductService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ProductService.models.Product;

@Service
public interface ProductService {
	public List<Product> getAllProduct();
	public Product getProductById(int id);
}

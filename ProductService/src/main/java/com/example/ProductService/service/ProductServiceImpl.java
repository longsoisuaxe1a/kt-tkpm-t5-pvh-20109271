package com.example.ProductService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ProductService.models.Product;
import com.example.ProductService.repositories.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository repository;
	@Override
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return repository.findById(id).get();
	}
	
}

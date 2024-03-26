package com.example.ProductService.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.ProductService.models.Customer;
import com.example.ProductService.models.Product;
import com.example.ProductService.repositories.CustomerRepository;
import com.example.ProductService.repositories.ProductRepository;
import com.example.ProductService.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	private ProductService service;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ProductRepository repository;
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	@GetMapping("/productbycustomer/{id}/{customerId}")
	public ResponseEntity<CustomerRepository> productByCustomer(@PathVariable Integer id,
			@PathVariable Integer customerId) {
		CustomerRepository customerReponsitory = new CustomerRepository();
		String url = "http://localhost:8082/api/v2/customer/" + id;
		ResponseEntity<Customer> reponse = restTemplate.getForEntity(url, Customer.class);
		Optional<Product> optional = repository.findById(customerId);
		Product student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			new RuntimeException("Khong co user theo id này");
		}
		Customer mentor = reponse.getBody();
		customerReponsitory.setCustomer(mentor);
		customerReponsitory.setProduct(student);
		return new ResponseEntity<CustomerRepository>(customerReponsitory, HttpStatus.OK);
	}
}

package com.example.ProductService.repositories;

import com.example.ProductService.models.Customer;
import com.example.ProductService.models.Product;

public class CustomerRepository {
	private Product product;
	private Customer customer;
	public CustomerRepository() {
		// TODO Auto-generated constructor stub
	}
	public CustomerRepository(Product product, Customer customer) {
		super();
		this.product = product;
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "CustomerRepository [product=" + product + ", customer=" + customer + "]";
	}
}

package com.example.ProductService.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String name;
	private String address;
	@OneToMany(mappedBy = "customer")
	private List<Product> products;
	public Customer() {
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int id) {
		this.customerId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(int customerId, String name, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + customerId + ", name=" + name + ", address=" + address + "]";
	}
}

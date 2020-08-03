package com.dxctraining.service;

import java.util.List;

import com.dxctraining.entities.Customer;

public interface ICustomerService {
Customer findById(int id);
	
	List<Customer> findAll();
	
	void add(Customer customer);
	
	Customer update(Customer customer);
	
	void delete(int id);

	Customer updateName(int id, String newName);
	
}

package com.dxctraining.dao;

import com.dxctraining.entities.*;

import com.dxctraining.exceptions.CustomerNotFoundException;

import java.util.*;

public class CustomerDaoImpl implements ICustomerDao{
	@Override
	public Customer updateName(int id, String name) {
		Customer customer = findById(id);
		customer.setName(name);
		return customer;

	}

	@Override
	public void add(Customer customer) {
		int id = generateId();
		customer.setId(id);
		
	}

	@Override
	public Customer update(Customer customer) {
		int id = customer.getId();
		return customer;
	}

	private Map<String,Customer> store=new HashMap<>();
	private int generateId;
	
	private int generateId() {
		generateId++;
		return generateId;
	}

		@Override
	public Customer findById(int id) {
		Customer customer=store.get(id);
		if(customer==null) {
			throw new CustomerNotFoundException("customer not found for id= "+id);
		}
		return customer;
	}
	@Override
	public List<Customer> findAll() {
		Collection<Customer> values = store.values();
		List<Customer> list = new ArrayList<>();
		for (Customer value : values) {
			list.add(value);
		}
		return list;
	}
	
	public int getGenerateId() {
		return generateId;
	}

	public void setGenerateId(int generateId) {
		this.generateId = generateId;
	}

	@SuppressWarnings("unlikely-arg-type")
	public void delete(int id) {
		store.remove(id);
	}		
	
}


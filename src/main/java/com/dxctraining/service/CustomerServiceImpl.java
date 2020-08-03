package com.dxctraining.service;

	
import java.util.List;

	import com.dxctraining.dao.*;
	import com.dxctraining.entities.*;
	import com.dxctraining.exceptions.*;

	public class CustomerServiceImpl implements ICustomerService {

		private ICustomerDao dao = new CustomerDaoImpl();

		@Override
		public Customer findById(int id) {
			checkId(id);
			Customer customer = dao.findById(id);
			return customer;
		}



		@Override
		public List<Customer> findAll() {
			List<Customer>list=dao.findAll();
			return list;
		}

		
		
		public void checkId(int id) {
			if(id < 1) {
		throw new InvalidCustomerArgumentException("id can't be negative");
	
			}
		}
		public void checkName(String name) {
			if (name == null || name.isEmpty()) {
				throw new InvalidCustomerArgumentException("name cant be null or empty");
			}
		}
		
		public void checkStudent(Customer customer) {
			if(customer==null) {
				throw new InvalidCustomerArgumentException("customer cant be null or empty");
					
			}
		}
		@Override
		public Customer updateName(int id, String name) {
			checkId(id);
			checkName(name);
			Customer customer = dao.updateName(id, name);
			return customer;
		}

		@Override
		public Customer update(Customer customer) {
			checkStudent(customer);
			customer =dao.update(customer);
		    return customer;
		}

		@Override
		public void add(Customer customer) {
			checkStudent(customer);
			dao.add(customer);
			
		}



		@Override
		public void delete(int id) {
			checkId(id);	
			dao.delete(id);
			
		}


	}
			

package com.dxctraining.ui;

import java.util.*;
import com.dxctraining.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.service.*;

public class CustomerMain {
	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String[] args) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}
	public void runApp() {
		try {
			Offer j2=new Offer(1,"j2");
			Offer j1=new Offer(1,"j1");
			Offer embedded=new Offer(3,"embedded");
			RegularCustomer customer1 = new RegularCustomer("bhanu", 500, "penugonda",j2);
			service.add(customer1);
			int id1=customer1.getId();
			RegularCustomer customer2 = new RegularCustomer("chinni", 1500, "bhimavaram",j2);
			service.add(customer2);
			int id2=customer2.getId();
			BusinessCustomer customer3 = new BusinessCustomer("mallika", 2500, "banglore",j1);
			service.add(customer3);
			int id3=customer3.getId();
			BusinessCustomer customer4 = new BusinessCustomer("smily", 5000, "hyderabad",j1);
			service.add(customer4);
			int id4=customer4.getId();
			
			service.delete(customer2.getId());
			service.updateName(customer1.getId(), "bhanu");

			Customer fetched = service.findById(id3);
			display(fetched);
			System.out.println("********display all students******");
			displayAll();
		} catch (InvalidCustomerArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (CustomerNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
		}

	}

	public void displayAll() {
		List<Customer> list = service.findAll();
		for (Customer customer : list) {
			display(customer);
		}
	}

	public void display(Customer customer) {
		System.out.println(customer.getName() + " " + customer.getBalance());
		Offer coupon=customer.getOffer();
		System.out.println("id= "+ coupon.getId()+"coupon= "+ coupon.getCoupon());

		if (customer instanceof RegularCustomer) {
			RegularCustomer regular = (RegularCustomer) customer;
			System.out.println("houseaddress is " + regular.getHouseAddress());
		}

		if (customer instanceof BusinessCustomer) {
			BusinessCustomer business = (BusinessCustomer) customer;
			System.out.println("businessaddress is " + business.getBusinessAddress());
		}
	}

}

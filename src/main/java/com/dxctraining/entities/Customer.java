package com.dxctraining.entities;

public class Customer {
	private String address;
	private String name;
	private double balance;
	private Offer offer;

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public Customer(String name, double balance, Offer offer) {
		this.name = name;
		this.balance = balance;
		this.offer=offer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

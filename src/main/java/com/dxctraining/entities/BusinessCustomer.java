package com.dxctraining.entities;

public class BusinessCustomer extends Customer{

	private String businessAddress;
	
	public BusinessCustomer(String name, double balance, String businessAddress,Offer offer)
	{
		super(name,balance,offer);
		this.businessAddress=businessAddress;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
public int getId() {
		
		return 0;
	}
	
}
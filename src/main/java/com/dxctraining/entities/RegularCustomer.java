package com.dxctraining.entities;

public class RegularCustomer extends Customer{
	private String houseAddress;
	public RegularCustomer(String name,double balance,String houseAddress,Offer offer) {
		super(name,balance,offer);
		this.houseAddress=houseAddress;
	}
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public int getId() {
		
		return 0;
	}
	

}

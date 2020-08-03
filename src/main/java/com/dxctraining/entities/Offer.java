package com.dxctraining.entities;

public class Offer {
	private int id;
	private String coupon;
	
	public Offer(int id,String coupon) {
		this.id=id;
		this.coupon=coupon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	

}

package org.dxctraining.entities;

public class FictionBook extends BookLibrary {
	private String charactername;
	private double cost;
	
	public FictionBook(String id,String name,Author author,double cost,BookLibrary book,String charactername) {
		super(id,name,cost,author,book);
		this.charactername=charactername;
		this.cost=cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCharactername() {
		return charactername;
	}

	public void setCharactername(String charactername) {
		this.charactername = charactername;
	}

}

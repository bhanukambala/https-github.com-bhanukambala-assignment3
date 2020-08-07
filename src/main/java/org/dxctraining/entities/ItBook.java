package org.dxctraining.entities;

public class ItBook extends BookLibrary {

	private String language;
	private double version;
	private double cost;
	public ItBook(String id,String name,Author author, double cost,BookLibrary book, String language,double version) {
		super(id,name,cost,author, book);
		this.language=language;
		this.version=version;
		this.cost=cost;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	
}

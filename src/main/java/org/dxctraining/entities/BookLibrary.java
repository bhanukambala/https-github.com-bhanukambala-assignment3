package org.dxctraining.entities;

public class BookLibrary {
	
	private String id;
	private String name;
	private BookLibrary book;
	private Author author;
	private double cost;
	
	
	public BookLibrary(String id,String name,double cost,Author author,BookLibrary book) {
		this.author=author;
		this.id=id;
		this.name=name;
		this.book=book;
		this.cost=cost;
	}

	
	

	public BookLibrary(BookLibrary book) {
	this.book=book;	
	}




	public BookLibrary getBook() {
		return book;
	}

	public void setBook(BookLibrary book) {
		this.book = book;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}




	public void setCost(double cost) {
		// TODO Auto-generated method stub
		
	}

}

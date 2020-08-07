package org.dxctraining.ui;

import java.util.*;


import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;
import org.dxctraining.service.*;

public class BookMain {
	private IBookService service=new BookServiceImpl();
	private BookLibrary book;
	
	public static void main(String[] args) {
		BookMain demo = new BookMain();
		demo.runApp();
	}
	public void runApp() {
		try {
			Author a1= new Author("h1","stephen king");
			Author a2= new Author("h2","toni");
			Author embedded=new Author("h3","embedded");
			BookLibrary b1=new BookLibrary(book);
			ItBook book1=new ItBook("bk1 ","misery ",a1,1500,b1, "english",1.0);
			service.add(book1);
			double cost1=book1.getCost();
			BookLibrary books1=book1.getBook();
			FictionBook book2=new FictionBook("bk2 ","Beloved ",a2,2000,b1, "bhanu");
			service.add(book1);
			BookLibrary books2=book2.getBook();
			double cost2=book2.getCost();
			service.delete(book1.getBook());
			service.update(book2.getBook());
			BookLibrary fetched = service.findByBook(books2);
			display(fetched);
			System.out.println("********display all books******");
			displayAll();
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (BookNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
		}

		
	}
	private void displayAll() {
		List<BookLibrary> list=service.findAll();
		for(BookLibrary book:list) {
			display(book);
		}
		
	}
	public void display(BookLibrary book) {
		System.out.println(book.getId()+""+book.getName()+""+book.getAuthor()+""+book.getBook());
		if(book instanceof FictionBook) {
			FictionBook fiction=(FictionBook) book;
			System.out.println("character name is "+fiction.getCharactername());
		}
		if(book instanceof ItBook) {
			ItBook it=(ItBook) book;
			System.out.println("language is "+it.getLanguage()+" and version is "+it.getVersion());
		}
	}
}
	
package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;

public class BookDaoImpl implements IBookDao {

	private Map<BookLibrary,BookLibrary> store=new HashMap<>();
	private BookLibrary book;
	
		
	@Override
	public BookLibrary findByBook(BookLibrary book) {
	BookLibrary booklibrary=store.get(book);
	if(book==null) {
		throw new BookNotFoundException("book not found "+book);
	}
	return book;
	}

	@Override
	public List<BookLibrary> findAll() {
		Collection<BookLibrary> values=store.values();
		List<BookLibrary> list=new ArrayList<>();
		for(BookLibrary value:values) {
			list.add(value);
		}
		return list;
				
	}

	@Override
	public BookLibrary updateCost(BookLibrary book, double cost) {
		BookLibrary booklibrary=findByBook(book);
		book.setCost(cost);
		return booklibrary;
	}

	@Override
	public void add(BookLibrary book) {
		BookLibrary books=book();
		store.put(book, book);
		book.setBook(book);
		
	}

	private BookLibrary book() {
		
		return null;
	}

	@Override
	public BookLibrary update(BookLibrary book) {
		BookLibrary books=book.getBook();
		store.put(book, book);
		return books;
	}

	@Override
	public void delete(BookLibrary book) {
		store.remove(book);
		
	}

}

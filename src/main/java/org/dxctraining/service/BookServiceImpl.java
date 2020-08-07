package org.dxctraining.service;

import java.util.List;

import org.dxctraining.dao.*;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;

public class BookServiceImpl implements IBookService {
	private IBookDao dao=new BookDaoImpl();
	
	@Override
	public BookLibrary findByBook(BookLibrary boook) {
		checkBook(boook);
		BookLibrary books=dao.findByBook(boook);
		return books;
	}

		public void checkCost(double cost) {
		if(cost<1) {
			throw new InvalidArgumentException("cost can't be negative");
			
		}
		}
		public void checkBook(BookLibrary boook) {
			if(boook==null) {
				throw new InvalidArgumentException("book can't be null or empty");
			}
		}
		

	@Override
	public List<BookLibrary> findAll() {
		List<BookLibrary> list=dao.findAll();
		return list;
	}

	@Override
	public BookLibrary updateCost(BookLibrary boook, double cost) {
		checkBook(boook);
		checkCost(cost);
		BookLibrary books=dao.updateCost(boook, cost);
		return books;
	}

	@Override
	public void add(BookLibrary boook) {
		checkBook(boook);
		dao.add(boook);
		
	}

	@Override
	public BookLibrary update(BookLibrary boook) {
		checkBook(boook);
		boook=dao.update(boook);
		return boook;
	}

	@Override
	public void delete(BookLibrary boook) {
		checkBook(boook);
		dao.delete(boook);
		
	}

}

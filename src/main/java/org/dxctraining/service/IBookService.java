package org.dxctraining.service;

import java.util.List;


import org.dxctraining.entities.BookLibrary;

public interface IBookService {
	List<BookLibrary> findAll();
	BookLibrary updateCost(BookLibrary boook,double cost);
	void add(BookLibrary boook);
	BookLibrary findByBook(BookLibrary boook);
	BookLibrary update(BookLibrary boook);
	void delete(BookLibrary boook);

}

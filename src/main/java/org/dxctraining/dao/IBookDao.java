package org.dxctraining.dao;
import java.util.List;

import org.dxctraining.entities.*;


public interface IBookDao {
	
	List<BookLibrary> findAll();
	void add(BookLibrary boook);
	BookLibrary update(BookLibrary boook);
	void delete(BookLibrary boook);
	BookLibrary findByBook(BookLibrary book);
	BookLibrary updateCost(BookLibrary book, double cost);

}

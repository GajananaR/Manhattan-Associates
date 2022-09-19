package com.gj.dao;
import java.util.List;

import com.gj.model.Book;

public interface IDAOBook {
	public List<Book> DisplayBookDetails();
	public void insertBook(Book b);
    public void deleteBookById(int id);
    public void searchByName(String name);
    public void updatePriceById(int id, Double price);

}

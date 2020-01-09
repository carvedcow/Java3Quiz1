package com.LibrarySystem.dao;

import java.util.List;

import com.LibrarySystem.model.Book;

//DAO - Data Access Object
public interface BookDao {
	//method
	public int insertBook(Book book);
	
	public List<Book> getBooks();
}

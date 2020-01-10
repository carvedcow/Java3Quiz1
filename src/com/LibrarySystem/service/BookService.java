package com.LibrarySystem.service;

import java.util.List;

import com.LibrarySystem.model.Book;

public interface BookService {
	public List<Book> getBooks();
	
	public boolean addBook(Book book);
	
	public Book getBookById(int bookId); // Read

	public boolean updateBook(Book book); // Update

}

package com.LibrarySystem.service;

import java.util.List;

import com.LibrarySystem.model.Book;

public interface BookService {
	public List<Book> getBooks(); //Read
	
	public boolean addBook(Book book); //Create
	
	public Book getBookById(int bookId); // Read

	public boolean updateBook(Book book); // Update
	
	public boolean deleteBook(int bookId); //Delete

}

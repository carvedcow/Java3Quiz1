package com.LibrarySystem.dao;

import java.util.List;

import com.LibrarySystem.model.Book;

//DAO - Data Access Object
public interface BookDao {
	//method
	public int insertBook(Book book); //CREATE
	
	public List<Book> getBooks(); //READ
	
	public Book getBookById(int bookId); //READ
	
	public boolean updateBook(Book book); //UPDATE
	
	public boolean deleteBook(int bookId); //DELETE

}

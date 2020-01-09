package com.LibrarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.LibrarySystem.dao.BookDao;
import com.LibrarySystem.model.Book;

@Service
@Qualifier("computer")
public class CompBookServiceImp implements BookService {
	//values
	List<Book> books;
	
	//BookDao is a Data Access Object.
	@Autowired
	@Qualifier("bookDao")
	BookDao bookDao; 
	
	//constructors
	public CompBookServiceImp() {
		books = new ArrayList<Book>();

		books.add(new Book("Intro to Java", "John", 600, 2010));
		books.add(new Book("Intro to Python", "Dave", 450, 2016));
		books.add(new Book("Intro to MySQL", "Dan", 300, 1999));
	}
	
	
	@Override
	public List<Book> getBooks() {
		//return books;
		return bookDao.getBooks();
	}
	
	
	@Override
	public boolean addBook(Book book) {
		//books.add(book);
		//return true;
		return bookDao.insertBook(book) > 0;
	}
	
	
}

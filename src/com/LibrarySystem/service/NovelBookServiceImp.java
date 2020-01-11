package com.LibrarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.LibrarySystem.model.Book;

@Service
@Qualifier("novel")
public class NovelBookServiceImp implements BookService{
	
	List<Book> books;
	@Override
	public List<Book> getBooks() {
		books = new ArrayList<Book>();

		books.add(new Book("Game of Thrones", "John", 622, 2011));
		books.add(new Book("Life of Pi", "Dave", 311, 2012));

		return books;
	}

	@Override
	public boolean addBook(Book book) {
		books.add(book);
		return true;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

}

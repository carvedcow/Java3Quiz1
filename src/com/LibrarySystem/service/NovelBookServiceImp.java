package com.LibrarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.LibrarySystem.model.Book;

@Service
@Qualifier("novel")
public class NovelBookServiceImp implements BookService{

	@Override
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Game of Thrones", "John", 622, 2011));
		books.add(new Book("Life of Pi", "Dave", 311, 2012));

		return books;
	}

}

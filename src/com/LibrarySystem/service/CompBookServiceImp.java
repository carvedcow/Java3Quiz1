package com.LibrarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.LibrarySystem.model.Book;

@Service
@Qualifier("computer")
public class CompBookServiceImp implements BookService {

	@Override
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Intro to Java", "John", 600, 2010));
		books.add(new Book("Intro to Python", "Dave", 450, 2016));
		books.add(new Book("Intro to MySQL", "Dan", 300, 1999));

		return books;
	}
}

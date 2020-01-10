package com.LibrarySystem.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	//values
	private int id;
	private String title;
	private String author;
	private int pageCount;
	private int year;
	
	//constructors
	public Book() {
		
	}
	
	public Book(String title, String author, int pageCount, int year) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.year = year;
	}
	
	public Book(int id, String title, String author, int pageCount, int year) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.year = year;
	}
	
	//methods
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}

package com.LibrarySystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="book")
public class Book {
	
	//values
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "pageCount")
	private int pageCount;
	
	@Column(name = "year")
	private int year;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name="authorId")
	private int authorId;
	
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

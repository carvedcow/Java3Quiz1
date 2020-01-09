package com.LibrarySystem.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.model.Book;

@Repository
@Qualifier("bookDao")
public class BookDaoImp implements BookDao {

	JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_BOOK = "insert into " + "book(title, author, pageCount, year) values(?, ?, ?, ?)";
	private final String SQL_SELECT_BOOK = "select title, author, pageCount, year from book";

	
	public BookDaoImp(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int insertBook(Book book) {
		return jdbcTemplate.
				update(SQL_INSERT_BOOK, 
				book.getTitle(), 
				book.getAuthor(),
				book.getPageCount(),
				book.getYear());
	}

	@Override
	public List<Book> getBooks() {
		return jdbcTemplate.query(SQL_SELECT_BOOK, new BookMapper());
	}

}

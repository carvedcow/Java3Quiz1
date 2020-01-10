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
	private final String SQL_SELECT_BOOK = "select id, title, author, pageCount, year from book";
	private final String SQL_SELECT_BOOK_BY_ID = "select id, title, author, pageCount, year from book where id = ?";
	private final String SQL_UPDATE_BOOK = "update book set title = ? , author = ? , pageCount = ? , year = ? where id = ? ";

	
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

	@Override
	public Book getBookById(int bookId) {
		return jdbcTemplate.queryForObject(SQL_SELECT_BOOK_BY_ID, 
				new Object[]{bookId}, new BookMapper());
	}
	
	@Override
	public boolean updateBook(Book book) {
		int updateResult = jdbcTemplate.update
				//THE ORDER OF THE VALUES MATTER BASED ON YOUR SQL QUERY
				(SQL_UPDATE_BOOK,
						book.getTitle(),
						book.getAuthor(),
						book.getPageCount(),
						book.getYear(),
						book.getId()
						);
		return updateResult > 0;
	}

	

}

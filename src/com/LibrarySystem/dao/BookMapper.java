package com.LibrarySystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.LibrarySystem.model.Book;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getString("title"), rs.getString("author"), rs.getInt("pageCount"), rs.getInt("year"));
	}

}

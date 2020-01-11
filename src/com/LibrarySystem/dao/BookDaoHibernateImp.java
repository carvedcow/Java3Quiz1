package com.LibrarySystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.model.Book;

@Repository
//@Qualifier("bookDao")
public class BookDaoHibernateImp implements BookDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insertBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
		return 1;
	}

	@Override
	public List<Book> getBooks() {
		//the "from Book" is the BookEntity, NOT the Table Book
		return getSession().createQuery("from Book", Book.class).list();

	}

	@Override
	public Book getBookById(int bookId) {
		return (Book) getSession().get(Book.class, bookId);
	}

	@Override
	public boolean updateBook(Book book) {
		getSession().update(book);
		return true;
	}
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean deleteBook(int bookId) {
		getSession().delete(getBookById(bookId));
		return true;
	}

}

package com.deloitte.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deloitte.spring.entity.Book;

@Repository
public class BookDAO {
	SessionFactory factory = null;

	@Autowired
	public BookDAO(SessionFactory factory) {
		this.factory = factory;
	}
	
	public boolean insertBook(Book book) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(book);
		trans.commit();
		session.close();
		return book != null;
	}

	public boolean updateBook(Book book) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(book);
		trans.commit();
		session.close();
		return book != null;
	}

	public boolean deleteBook(int bookid) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Book b = session.get(Book.class, 101);
		if (b != null) {
			session.delete(b);
			trans.commit();
		}
		return b != null;
	}

	public Book getBook(int bookid) {
		Session session = factory.openSession();
		return session.get(Book.class, 101);
	}

	@SuppressWarnings("unchecked")
	public List<Book> getBook() {
		Session session = factory.openSession();
		return session.createQuery("from Book").list();
	}
}

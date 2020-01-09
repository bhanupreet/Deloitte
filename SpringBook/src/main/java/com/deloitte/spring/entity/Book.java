package com.deloitte.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "book")
public class Book {

	@Id
	@Column(columnDefinition = "number(3)")
	private int bookId;

	@Column(columnDefinition = "varchar2(20)")
	private String bookName;

	@Column(columnDefinition = "number(8,2)")
	private double price;

	@Column(columnDefinition = "varchar2(20)")
	private String author;

	public int getBookId() {
		return bookId;
	}

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, double price, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

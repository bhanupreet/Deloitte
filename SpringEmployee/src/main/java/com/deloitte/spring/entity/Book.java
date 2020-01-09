package com.deloitte.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Book {

	@Id
	@Column(columnDefinition = "number(3)")
	private int BookId;
	private String bookName;
}

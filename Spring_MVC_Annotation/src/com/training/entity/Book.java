package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Book {

	Logger log = Logger.getLogger(this.getClass().getName());

	private long bookNumber;
	private String bookName;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long booknumber) {
		this.bookNumber = booknumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}

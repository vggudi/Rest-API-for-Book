package com.mojro.spring.model;


public class Book {
	private String ISBN;
	private String name;
	private String author;
	private double price;

	public Book() {

	}

	public Book(String ISBN, String name, String author, double price) {
		this.ISBN = ISBN;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

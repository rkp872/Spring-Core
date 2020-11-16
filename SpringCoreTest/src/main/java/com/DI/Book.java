package com.DI;

import java.util.List;

public class Book
{
	private int isbn;
	private String bookTitle;
	private int price;
	private List authors;
	private Publisher publisher;
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List getAuthors() {
		return authors;
	}
	public void setAuthors(List authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookTitle=" + bookTitle + ", price=" + price + ", authors=" + authors
				+ ", publisher=" + publisher + "]";
	}
	
}

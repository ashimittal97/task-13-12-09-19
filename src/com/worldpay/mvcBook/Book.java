package com.worldpay.mvcBook;

public class Book {
	private int Book_id;
	private String Book_Name;
	private String Subject;
	private String Edition;
	private int price;

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	

	public String getBook_Name() {
		return Book_Name;
	}

	
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getEdition() {
		return Edition;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int book_id, String book_Name, String subject, String edition, int price) {
		super();
		Book_id = book_id;
		Book_Name = book_Name;
		Subject = subject;
		Edition = edition;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Book_Name=" + Book_Name + ", Subject=" + Subject + ", Edition=" + Edition
				+ ", price=" + price + "]";
	}

}

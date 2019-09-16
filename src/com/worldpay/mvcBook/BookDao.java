package com.worldpay.mvcBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sound.midi.Soundbank;

public class BookDao {

	
		private Connection con;

		
		public void saveBook(Book book) {
			try {
				String sql = "insert into books values(default,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				//ps.setInt(1, book.getBook_id());
				ps.setString(1, book.getBook_Name());
				ps.setString(2, book.getSubject());
				ps.setString(3, book.getEdition());
				ps.setInt(4, book.getPrice());
				System.out.println(sql);
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public Book DeleteBook(int bookid) {
			Book book = searchBook(bookid);
			String sql = "Delete FROM books WHERE Book_id=?";
			PreparedStatement ps;
			try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookid);
			ps.executeUpdate();
			} catch (Exception e) {
			e.printStackTrace();
			}

			return book;

			}
		public Book searchBook(int bookid) {
			Book book = null;
			String sql = "SELECT * FROM books WHERE bookid=?";
			try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bookid);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

			book = new Book();
			book.setBook_id(rs.getInt(1));
			book.setBook_Name(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setSubject(rs.getString(4));
			book.setEdition(rs.getString(5));
		

			}

			} catch (Exception e) {
			e.printStackTrace();
			}

			return book;
			}
		public BookDao() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/ashi", "root", "root");
				System.out.println("conected");
				
			} catch (Exception e) {
				e.printStackTrace();
				}
			
		
	}

}

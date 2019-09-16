package com.worldpay;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import com.worldpay.mvcBook.Book;
import com.worldpay.mvcBook.BookDao;

/**
 * Servlet implementation class InsertDetails
 */
@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String BookName = request.getParameter("name");
		String BookSubject = request.getParameter("subject");
		int Price = Integer.parseInt(request.getParameter("price"));
		String Edition=request.getParameter("edition");
		
		BookDao bookdao=new BookDao();
		Book book=new Book();
		//book.setBook_id(book_id);
		book.setBook_Name(BookName);
		book.setSubject(BookSubject);
		book.setPrice(Price);
		book.setEdition(Edition);
		bookdao.saveBook(book);
		//bookdao.DeleteBook(bookid);
		HttpSession session=request.getSession();
		session.setAttribute("bookinfo", book);
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
	}

}

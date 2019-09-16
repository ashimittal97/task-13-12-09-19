package com.worldpay;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

import com.worldpay.mvcBook.Book;
import com.worldpay.mvcBook.BookDao;


@WebServlet("/deleteBooks")
public class deleteBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Book_id=Integer.parseInt(request.getParameter("Bookid"));
		BookDao bd=new BookDao();
		Book book=bd.DeleteBook(Book_id);
	//	Book book=new Book();
		//store the model in scope Object
		HttpSession session=request.getSession();
		session.setAttribute("deleteinfo", book);
		
		response.sendRedirect("delete.jsp");
	}

	
}

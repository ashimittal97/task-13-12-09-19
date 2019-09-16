package com.worldpay;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.worldpay.mvcBook.Book;
import com.worldpay.mvcBook.BookDao;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//reads the request
		int code=Integer.parseInt(request.getParameter("code"));
	//process it using dao/service classes
		BookDao dao=new BookDao();
		Book book=dao.searchBook(code);
	//store the model in scope object
		HttpSession session=request.getSession();
		session.setAttribute("bookinfo", book);
		//request.setAttribute("bookinfo", book);
	//forwards the request to view
		//response.sendRedirect("details.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
	
	}

}

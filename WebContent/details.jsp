<%@page import="com.worldpay.mvcBook.Book"%>
<%@page import="com.worldpay.mvcBook.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
  <%
	Book book=(Book)session.getAttribute("bookinfo");
%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>DETAILS ARE...</h3>
<hr>
     <pre>
            BName   :	<%=book.getBook_Name()%>
			Subject :	<%=book.getSubject()%>
			Price   :	<%=book.getPrice()%>
			Edition :	<%=book.getEdition()%>
		
		
			
      </pre>
     <hr/>
     <a href="home.jsp">Home</a>
		
</body>
</html>
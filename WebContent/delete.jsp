<%@page import="com.worldpay.mvcBook.Book"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%
	Book book=(Book)session.getAttribute("deleteinfo");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>DELETED--BOOK--INFO</h3>
<hr>
  <pre>
              BName   :	<%=book.getBook_Name()%>
			Subject :	<%=book.getSubject()%>
			Price   :	<%=book.getPrice()%>
			Edition :	<%=book.getEdition()%>
		
 </pre>
<hr>
<a href="home.jsp">Home</a>

</body>
</html>
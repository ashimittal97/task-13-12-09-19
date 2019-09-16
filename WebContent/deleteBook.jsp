<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="InsertDetails" style="align: center">
		<p align="center">
			<b>Books Details Form</b>
		</p>
		<hr />
		<div class=container>
			<table align="center">
				<tr>
					<th>Enter the Book Id</th>
					<td><input type="text" name="Bookid"
						placeholder="enter Book Id" /></td>
				</tr>

				
			</table>
		</div>
		<hr />
		<a href="home.jsp">Home</a>
		<a href="deleteBook.jsp">delete-book</a>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table {
	border-collapse: collapse;
	width: 35%;
	height: 500px;
	text-align: center;
}

input[type=text]:hover {
	height: 35px;
	padding-left: 15px;
	border: 1px solid #ccc;
	box-shadow: 1px 1px grey;
	border-radius: 4px;
	resize: vertical;
}

input[type=submit]:hover {
	height: 35px;
	padding-left: 15px;
	box-shadow: 2px 2px grey;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: center;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 30px;
	width: 507px;
	margin-left: 475px;
}
</style>
<body>
	<form action="InsertDetails" style="align: center">
		<p align="center">
			<b>Books Details Form</b>
		</p>
		<hr />
		<div class=container>
			<table align="center">
				<tr>
					<th>Book Name</th>
					<td><input type="text" name="name"
						placeholder="enter book name" /></td>
				</tr>

				<tr>
					<th>Subject</th>
					<td><input type="text" name="subject"
						placeholder="enter the subject of book" /></td>
				</tr>

				<tr>
					<th>Price </th>
					<td><input type="text" name="price" placeholder="enter price" /></td>
				</tr>

				<tr>
					<th>Edition </th>
					<td><input type="text" name="edition"
						placeholder="enter the edition " /></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input id="btn" type="submit" name="save"
						value="Save Information" /></td>
				</tr>
			</table>
		</div>
		<hr />
		<a href="home.jsp">Home</a>
		<a href="deleteBook.jsp">delete-book</a>
	</form>
</body>
</html>
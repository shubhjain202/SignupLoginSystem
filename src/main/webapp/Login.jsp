<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="LoginServlet" method="post">
	<table>
	  <tr>
	   	  <td>
	   	  	 Name:
	   	  </td>
		  <td>
		  	<input type="text" name="name">
		  </td>
	  </tr>
	  <tr>
	   	  <td>
	   	  	Mob No:
	   	  </td>
		  <td>
		  	<input type="number" name="pass">
		  </td>
	  </tr>
	</table>
	<br>
	<input type="submit" value="Login">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN UP</title>
</head>
<body>
<form action="SignupServlet" method="post">
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
		  	<input type="number" name="mob">
		  </td>
	  </tr>
	</table>
	<br>
	<input type="submit" value="submit details">
</form>
</body>
</html>
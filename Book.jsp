<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="adminsegins.css">
<meta charset="ISO-8859-1">
<title>booking details</title>
</head>
<body >

<h1 align="center">Ticket booking</h1>
<br/><br/><br/>
	<div align="center">

		<form action="Book" method="POST">
		
		<input type="number" name="pass" placeholder="No of passenger" required><br/><br/><br/>
		<input type="submit" name="book" value="Book Ticket">
		</form>
</body>
</html>
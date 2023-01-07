<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="adminsegins.css">
<link rel="stylesheet" href="./page.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
<h1 align="center">Delete Schedeule</h1>
	<div align="center">

		<form action="DeleteShip" method="POST">
		
		<input type="txet" name="ShipId" placeholder="Schedule ID" required><br/><br/><br/>
		<input type="submit" name="delete" value="Delete">
		</form>
</body>
</html>
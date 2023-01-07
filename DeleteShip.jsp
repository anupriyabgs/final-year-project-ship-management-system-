<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="adminsegins.css">
<link rel="stylesheet" href="./page.css">

<!-- <meta charset="utf-8"> -->
<title>Delete Ship</title>


</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
	<h1 align="center">Delete Ship</h1>
	<div align="center">

		<form action="DeleteShip" method="POST">
		<label for="Ship Name">ShipId 
		<input type="txet" name="ShipId" placeholder="Enter Ship Id" ></label><br/><br/><br/>
		<input type="submit" name="delete" value="Delete">
		</form>
		
	
</div>
</body>
</html>
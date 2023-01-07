<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./page.css">
<link rel="stylesheet" href="adminsegins.css">
<title>Insert title here</title>
</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
<h1 align="center">Modify Route</h1>
	<div align="center">

		<form action="ModfiyShip" method="GET">
		
		<input type="txet" name="ShipId" placeholder="Enter Route Id" required><br/><br/><br/>
		<input type="submit" name="delete" value="Modify">
		</form>
</body>
</html>
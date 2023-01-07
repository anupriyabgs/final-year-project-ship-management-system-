<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="adminsegins.css">
<link rel="stylesheet" href="./page.css">

<title></title>
</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
	<h1 align="center">Modify Ship</h1>
	<div align="center">

		<form action="ModfiyShip" method="GET">
		
		<input type="txet" name="ShipId" placeholder="Enter Ship Id" required><br/><br/><br/>
		<input type="submit" name="delete" value="Modify">
		</form>
</body>
</html>
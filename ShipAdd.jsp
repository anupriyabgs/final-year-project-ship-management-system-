<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./adminsegins.css">
<link rel="stylesheet" href="./page.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
<div id="login-form-wrap">
  <h2>Add ship</h2>
  <form id="login-form" action="AddShip" method="POST" >
   
    
    <p>
     
    <input type="text" id="shipname" name="ShipName" placeholder="Ship name" required>
    </p>
     <p>
   
    <input type="text" id="capacity" name="ShipID" placeholder=" Ship ID (0-1000)" required>
    </p>
    <p>
    
    <p>
   
   
    <input type="text" id="capacity" name="SeatingCapacity" placeholder="Seating Capacity (1-50000)" required>
    </p>
    <p>
    
    <input type="text" id="rcapacity" name="ReserCapacity" placeholder="Reservation (1-50000)" required>
    </p>
    <p>
    <input type="submit" id="add" value="Add">
    </p>
  </form>
  <div id="create-account-wrap">
  
  </div><!--create-account-wrap-->
</div>
</body>
</html>
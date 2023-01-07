<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./adminsegins.css">
<link rel="stylesheet" href="./page.css">
<title>ADD SCHEDULE</title>
</head>
<body>
<div class="dropdown">
	<button class="dropbtn"><a class=".dropdown-content-l" href="AdminMenu.jsp">Go Back</a></button>				
</div>
<div id="login-form-wrap">
  <h2>Add ship</h2>
  <form id="login-form" action="Add Schedule" method="POST" >
    <p>
     
    <input type="text" id="scheduleid" name="ShipName" placeholder="Schedule ID" required>
    </p>
    <p>
   
    <input type="text" id="shipID" name="SeatingCapacity" placeholder="Ship ID" required>
    </p>
    <p>
    
    <input type="text" id="routeID" name="ReserCapacity" placeholder="Route ID" required>
    </p>
     <p>
    
    <input type="date" id="Date" name="ReserCapacity" placeholder="Date" required>
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
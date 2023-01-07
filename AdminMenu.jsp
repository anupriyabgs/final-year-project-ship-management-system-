<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="./admin.css">
<script src="/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
</head>

<body background="cust-home.jpg" link="red" alink="yellow" vlink="#000">
<div>
	<h3 align="center">
		<font class="nav" face="Lato" size="6">Welcome Admin</font>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<font face="cinzel" size="4" color="yellow">
			<div class="dropdown">
				<button class="dropbtn">Ship Details</button>
				<div class="dropdown-content">
					<a href="ShipAdd.jsp">Add new Ship Details</a>
					<a href="ViewShips" method="GET">View Ship Details</a>
					<a href="DeleteShip.jsp">Delete Ship</a>
					<a href="ModifyShip.jsp">Modify Ship</a>
				</div>
			</div>
			<div class="dropdown">
				<button class="dropbtn">Schedule Details</button>
				<div class="dropdown-content">
					<a href="AddSchdedule.jsp">Add Schedule</a>
					<a href="ViewSchedule.htm">View Schedule
							Details</a>
					<a href="ModifySc.jsp">Modify Schedule
							Details</a>
					<a href="DeleteSc.jsp">Delete Schedule
							Details</a>
				</div>
			</div>
			<div class="dropdown">
				<button class="dropbtn">Route Details</button>
				<div class="dropdown-content">
					<a href="RouteAdd.jsp">Add Route</a>
					<a href="ViewRoute.htm">View Route Details</a>
					<a href="Modifyroute.jsp">Modify Route Details</a>
					<a href="Deletearoute.jsp">Delete Route</a>
				</div>
			</div>
			<div class="dropdown">
				<button class="dropbtn">View passengers</button>
				<div class="dropdown-content">
					<a href="Passenger">View passengers</a>
			    </div>
			</div>
			<div class="dropdown">
				<button class="dropbtn"><a href="Logout.jsp">Logout</a></button>
				
			</div>
		</font>
	</h3>
</div>
</body>
</html>
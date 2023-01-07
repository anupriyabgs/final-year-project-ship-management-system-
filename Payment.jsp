<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Payment details</title>
</head>
<body align="centre" style="background-image: url('cust-home.jpg');">
<div  >
<h2 align="centre">Payment Page</h2>
<form action="PaymentSucccessfull.jsp">
<table>
<tr>
<td>

<img align="left"src="atm.jpg" height="10%" width="30%"/>
<div align="centre"><br/><br/><br/><br/>
<input type="text" placeholder="Enter Card number"/><br/><br/><br/>
<input type="text" placeholder="Enter name"/><br/><br/><br/>
<input type="date" placeholder="Expiry date"/><br/><br/><br/>
<input type="text" placeholder="cvv"/>
<input type="submit" value="Pay"/>
</div>
</form>
</td>
</tr>
</table>
</div>
</body>
</html>
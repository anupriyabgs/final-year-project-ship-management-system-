
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
<div id="login-form-wrap">
  <h2>Login</h2>
  <form id="login-form" method="POST" action="Login">
    
    <table>
    <tr><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" id="admin" name="user" value="Admin">Admin&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="radio" id="user" name="user" value="User">User</td></tr></table>
    
    <p>
    <input type="text" id="email" name="emailId" placeholder="emailID" required>
    </p>
    <p>
    <input type="password" id="password" name="password" placeholder="password" required>
    </p>
    <p id="forget-wrap"><a href="#">Forget password?</a><p>
    <p>
    <input type="submit" id="login" value="Login">
    </p>
  </form>
  <div id="create-account-wrap">
    <p>Not a member? <a href="NewFile.jsp">Register</a><p>
  </div><!--create-account-wrap-->
</div>
</body>
</html>
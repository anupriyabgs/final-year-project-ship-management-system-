
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resigtration form</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="./styles.css">
</head>
<body>
<div id="login-form-wrap">
  <h2>Register</h2>
  <form id="login-form" action="Register" method="POST">
    <p>
    <input type="text" id="name" name="fname" placeholder="firstname" required>
    </p>
     <p>
    <input type="text" id="name" name="lname" placeholder="lastname" required>
    </p>
     <p>
    <input type="date" id="name" name="dob" placeholder="Date of Birth DD/MM/YYYY" required>
    </p>
    <table>
    <tr><td>Gender </td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="Male">Male
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="gender" value="Female">Female</td></tr>
    </table>
     <p>
    <input type="text" id="street" name="street" placeholder="street" required>
    </p>
     <p>
    <input type="text" id="location" name="location" placeholder="location" required>
    </p>
     <p>
    <input type="text" id="city" name="city" placeholder="city" required>
    </p>
     <p>
    <input type="text" id="state" name="state" placeholder="state" required>
    </p>
    <p>
    <input type="text" id="pincode" name="pincode" placeholder="pincode" required>
    </p>
    <p>
    <input type="text" id="phone" name="phone" placeholder="phone" required>
    </p>
    <p>
    <input type="email" id="email" name="email" placeholder="email" required>
    </p>
     <p>
    <input type="password" id="pwd" name="pwd" placeholder="password" required>
    </p>
    <p>
    <input type="password" id="pwd" name="cpwd" placeholder="confirm password" required>
    </p>
    <p>
    <input type="submit" id="login" value="Register">
    </p>
  </form>
  <div id="create-account-wrap">
    <p>Already have an account <a href="Login.jsp">Login</a><p>
  </div><!--create-account-wrap-->
</div>
</body>
</html>
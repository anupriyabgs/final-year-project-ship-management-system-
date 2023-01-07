
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
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
    <input type="email" id="email" name="email" placeholder="email" required>
    </p>
   <p>
    <input type="text" id="phone" name="phone" placeholder="phone" required>
    </p>
    <table>
    <tr><td>Gender </td><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" value="Male">Male
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="gender" value="Female">Female</td></tr>
    </table>
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
   
</div>

</body>
</html>
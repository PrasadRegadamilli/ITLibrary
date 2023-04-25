<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/submitDetails">
<div class="registerform">
<h2>Registration</h2>
<p>Please fill in this form to create an account.</p>
<table>
<label for="username">Username</label>
<input class="register-fields" type="text" placeholder="Enter username" name="username" id="username" required>

<label for="mobile">Mobile</label>
<input class="register-fields" type="text" placeholder="Enter mobile" name="mobile" id="mobile">

<label for="email">Email</label>
<input class="register-fields" type="text" placeholder="Enter Email" name="email" id="email">

<label for="createpassword">Create Password</label>
<input class="register-fields" type="text" placeholder="Enter password" name="createpassword" id="createpassword">

<label for="address">Address</label>
<input class="register-fields" type="text" placeholder="Enter Address" name="address" id="address">
<input class="register-btn" type="submit" value="Register" name="register">
<a href="login"><input class="login-btn" type="button" value="Login" name="login"></a>
</table>
</div> 


</form>

</body>
</html>
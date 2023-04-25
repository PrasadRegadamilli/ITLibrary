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
<form action="/adminDetails">
<div class="registerform">
<h2>Registration</h2>
<p>Please fill in this form to create an account.</p>
<table>
<label for="username">ID</label>
<input class="register-fields" type="text" placeholder="Enter Id" name="Id" id="username">

<label for="mobile">Name</label>
<input class="register-fields" type="text" placeholder="Enter Name" name="name" id="mobile">

<label for="email">Create password</label>
<input class="register-fields" type="text" placeholder="Enter Password" name="password" id="email">

<input class="register-btn" type="submit" value="Register" name="register">
<a href="adminlogin"><input class="login-btn" type="button" value="Login" name="login"></a>
</table>
</div> 


</form>

</body>
</html>
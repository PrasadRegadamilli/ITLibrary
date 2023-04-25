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
<form action="/submitLogin" method="post">
<div class="loginbox">
<div class="loginimg">
<img alt="" src="./images/logo.jpg">
</div>


<label for="uname"><b>Username</b></label>
<input class="login-field" type="text" name="username" placeholder="Enter username">

<label for="psw"><b>Password</b></label>
<input class="login-field" type="text" name="password" placeholder="Enter password">

<input class="login-btn" type="submit" value="Login" name="login">

<p>Don't have account? Please click on register</p>

<a href="registration"><input class="register-btn" type="button" value="Register" name="register" ></a>



</div>

</form>

</body>
</html>
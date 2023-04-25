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
<form action="/submitAdminLogin">
<div class="loginbox">
<div class="loginimg">
<img alt="" src="./images/logo.jpg">
</div>

<label for="uname"><b>Admin ID</b></label>
<input class="login-field" type="text" name="Id" placeholder="Enter Id">

<label for="psw"><b>Password</b></label>
<input class="login-field" type="text" name="password" placeholder="Enter password">

<input class="login-btn" type="submit" value="Login" name="login">

</div>

</form>

</body>
</html>
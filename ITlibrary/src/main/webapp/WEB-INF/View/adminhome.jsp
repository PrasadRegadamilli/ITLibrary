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
<form action="/adminhome">

<div class="admin_navi_bar">
<a href="#">Logout</a>
<a href="#">Employees</a>
<a href="retrieveUsers">Users</a>
<a href="adminBooksList">Books</a>
</div>

<div class="admin_logo">
<img class="img" alt="" src="./images/logo.jpg" width=250 height=79.5>
</div>

<div class="admin_welcome">
<h1>Welcome Admin</h1>
</div>

<div class="add_book">
<a href="books">Add Book</a>
</div>

<div class="add_book">
<a href="#">Available Employees</a>
</div>

<div class="add_book">
<a href="retrieveBooks">Available Books-${stock}</a>
</div>


<div class="scroll">
<marquee direction="right">
 <p>“An original idea. That can’t be too hard. The library must be full of them.”</p>
</marquee>
</div>

</form>
</body>
</html>
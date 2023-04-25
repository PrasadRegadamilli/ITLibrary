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
<form action="/submitBooks">

<div class="books">

<table class="bookstable">
<tr>
<td>Enter Book Name</td>
<td><input type="text" name="bookname"></td>
</tr>

<tr>
<td>Enter Author Name</td>
<td><input type="text" name="author"></td>
</tr>

<tr>
<td>Enter Technology Name</td>
<td><input type="text" name="technology"></td>
</tr>

<tr>
<td>Enter Stock</td>
<td><input type="text" name="stock"></td>
</tr>

<tr>
<td><input type="submit" value="Submit"></td>
<td><a href="adminhome"><input type="button" value="Go back to main menu"></a></td>
</tr>
</table>

</div>

</form>

</body>
</html>
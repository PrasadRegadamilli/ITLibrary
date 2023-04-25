<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
<form action="/takeABook">
<table>
<tr>
<td>Enter Username</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Select book</td>
<td>
<select name="book" id="book">

<option th:each="avlBooks : ${books}"
        th:value="${avlBooks.bookname}"
        th:text="${avlBooks.bookname }">

</option>

</select>
</td>
</tr>

<tr>
<td>Enter Book Issue Date</td>
<td><input type="text" name="issuedate"></td>
</tr>

<tr>
<td>Enter Book Return Date</td>
<td><input type="text" name="returndate"></td>
</tr>

</table>
<a href="dashboard"><input type="button" value="Go back to main menu"></a>
</form>
</body>
</html>
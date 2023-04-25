<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>

<table border="1" cellpadding="2" cellspacing="2">
<tr>
<th>Book_Name</th>
<th>Author_Name</th>
<th>Technology</th>
<th>Stock</th>
</tr>

<c:forEach items="${books}" var="book">
            <tr>
				<td>${book.bookname}</td>
				<td>${book.author}</td>
				<td>${book.technology}</td>
				<td>${book.stock}</td>
				
			</tr>
</c:forEach>

</table>

<a href="adminhome"><input type="button" value="Go back to main menu"></a>

</body>
</html>
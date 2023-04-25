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
<th>User_Name</th>
<th>Mobile</th>
<th>Email_Id</th>
<th>User_Password</th>
<th>Address</th>
</tr>

<c:forEach items="${users}" var="user">
            <tr>
				<td>${user.User_Name}</td>
				<td>${user.Mobile}</td>
				<td>${user.Email_Id}</td>
				<td>${user.User_Password}</td>
				<td>${user.Address}</td>
			</tr>
</c:forEach>

</table>

<a href="adminhome"><input type="button" value="Go back to main menu"></a>

</body>
</html>
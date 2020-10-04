<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>Your todos are:</p>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}&nbsp;&nbsp;&nbsp;<a href="/delete-todo.do?todo=${todo.name}">Delete</a></li>
		</c:forEach>
	</ol>
	<p><font color="red">${errorMessage}</font></p>
	<form method="POST" action="/todo.do">
		<input type="text" name="todo"/><input name="add" type="submit" />
	</form>
</body>
</html>
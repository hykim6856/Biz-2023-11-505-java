<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num1 = 10;
	int num2 = 20;
	int sum = num1 + num2;
	%>
	<h1>안녕하세요</h1>
	<p>
	<%= num1 %> 과 <%= num2 %> 의 덧셈결과는 <%= sum %>입니다!!
	<a href=".nation.jsp">나라</a>
</body>
</html>
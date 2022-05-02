<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h3>반갑습니다.</h3>
	<%
		// 자바코드.
		String name = "홍길동";
		out.println("<h3>" + name + "</h3>");
		
		String id = request.getParameter("user_id"); //user_id의 값을 가져와서 리턴 해주는 것
		String name2 = request.getParameter("user_name");
		out.println("<h4>입력값: [ID] : " + id + ", [Name] : " + name2 + "</h4>");
	%>
	
	<a href="student.do">Student Servlet</a>
</body>
</html>
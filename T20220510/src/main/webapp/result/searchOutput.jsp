<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>조회결과페이지</h3>
	
  	<h4>[Code]: ${book.bookCode } / [Title]: ${book.bookTitle } / [Author]: ${book.bookAuthor } / [Press]: ${book.bookPress } / [Price]: ${book.bookPrice }</h4>
  
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>
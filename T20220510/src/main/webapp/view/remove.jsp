<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
<c:choose>
    <c:when test="${!empty result }"><h3>${result }</h3></c:when>
    <c:otherwise>
    	<h3>도서정보삭제</h3>
    	<form action="./removeBook.do" method="post">
    	 코드: <input type="text" name="code" value="${book.bookCode }"><br>
    	 <input type="submit" value="삭제">
    	</form>
    </c:otherwise>
  </c:choose>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>modify.jsp</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>상품수정조회</h3>
    <form action="${pageContext.servletContext.contextPath }/searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="modify">
        <input type="submit" value="조회">
    </form>
    
    <!-- 도서수정을 위한 화면 작성코드를 입력하세요. -->
 <c:choose>
    <c:when test="${!empty result }"><h3>${result }</h3></c:when>
    <c:otherwise>
    	<h3>상품수정</h3>
    	<form action="${pageContext.servletContext.contextPath }/modify.do" method="post">
    	  상품번호: <input type="number" name="num"><br>
        상품이름: <input type="text" name="name"><br>
        상품가격: <input type="number" name="price"><br>
        카테고리: <input type="text" name="category"><br>
        내용: <input type="text" name="comment"><br>
        세일: <input type="number" name="sale"><br>
        사진: <input type="file" name="img"><br>
        성별: <input type="text" name="gender"><br>
        아이디: <input type="email" name="id" readonly><br>
    	 <input type="submit" value="수정">
    	</form>
    </c:otherwise>
  </c:choose>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>
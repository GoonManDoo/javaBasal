
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>상품 리스트.</title>
</head>

<body>
	<c:choose>
		<c:when test="${empty list }">
		<h3>상품정보가 없습니다.</h3>
		</c:when>
	<c:otherwise>
    <table border="1">
        <caption>상품목록</caption>
        <thead>
            <tr>
                <th>상품번호</th>
                <th>상품이름</th>
                <th>상품가격</th>
                <th>카테고리</th>
                <th>내용</th>
                <th>할인</th>
                <th>사진</th>
                <th>성별</th>
                <th>아이디</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list }" var="memberVO">
						<tr>
							<td>${memberVO.productNum }</td>
							<td>${memberVO.productName }</td>
							<td>${memberVO.productPrice }</td>
							<td>${memberVO.cateGory }</td>
							<td>${memberVO.coMent }</td>
							<td>${memberVO.sale }</td>
							<td>${memberVO.pImg }</td>
							<td>${memberVO.gender }</td>
							<td>${memberVO.eMail }</td>
							
						</tr>
					</c:forEach>
        </tbody>
    </table>
    </c:otherwise>
    </c:choose>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>상품추가</title>
</head>

<body>

    <h3>상품등록</h3>
    <form action="../insert.do" method="post">
        상품번호: <input type="number" name="num"><br>
        상품이름: <input type="text" name="name"><br>
        상품가격: <input type="number" name="price"><br>
        카테고리: <input type="text" name="category"><br>
        내용: <input type="text" name="comment"><br>
        세일: <input type="number" name="sale"><br>s
        사진: <input type="file" name="img"><br>
        성별: <input type="text" name="gender"><br>
        아이디: <input type="email" name="id"><br>
        <input type="submit" value="등록">
    </form>
    
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>상품추가</title>
</head>

<body>

    <h3>상품등록</h3>
<<<<<<< HEAD
    <form action="../insert.do" method="post" enctype="multipart/form-data">
=======
    <form action="../fileUploadServlet" method="post" name="frm" enctype="multipart/form-data">
>>>>>>> branch 'master' of https://github.com/GoonManDoo/GoonManDoo.git
        상품번호: <input type="number" name="num"><br>
        상품이름: <input type="text" name="name"><br>
        상품가격: <input type="number" name="price"><br>
        카테고리: <input type="text" name="category"><br>
        내용: <input type="text" name="comment"><br>
        세일: <input type="number" name="sale"><br>
        사진: <input type="file" name="pimg"><br>
        성별: <input type="text" name="gender"><br>
        아이디: <input type="email" name="email"><br>
        <input type="submit" value="등록">
    </form>
    
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>
<%@page import="co.edu.Student"%>
<%@page import="co.edu.StudentDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>영어점수</th>
				<th>국어점수</th>
			</tr>
		</thead>
		<tbody>
		<%
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		for (Student student : list) {
		out.print("<tr><td><a href='StudentGetServlet?cmd=search&user_id="+student.getStudentNo()+"'>" + student.getStudentNo() +"</td><td>" + student.getStudentName() + "</td><td>" + student.getEngScore() + "</td><td>" + student.getKorScore() + "</td></tr>");
		}
		%>
		</tbody>
	</table>
	<hr>
	<a href="form.jsp">폼화면</a>
	<script>
	</script>
</body>
</html>
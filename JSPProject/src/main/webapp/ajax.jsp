<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
	// Asynchronous Javascript And Xml.
	let url = 'StudentGetServlet'; //get 방식 연결
	fetch(url)
		.then(result => {
			console.log(result)
			return result.json(); // {"id":23, "name":"hong"}
		})
		.then(result => {
			console.log(result);
		})
		.catch(error => {
			console.log(error);
		});
	
	</script>
</body>
</html>
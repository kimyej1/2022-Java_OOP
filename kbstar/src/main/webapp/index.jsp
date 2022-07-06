<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	섭섭이와 함께하는 해피 바이러스...JSP
</div>
<form action="greeting" method="post"> <!-- action : 이걸 받을 최종 컨트롤러 = servlet -->
	<input type="text" 		name="id"/>
	<input type="password" 	name="pwd"/>
	<input type="submit"	value="click">
</form>	
<hr/>
<!-- form은 get/post 정할 수 있지만, a는 get만 가능! -->
<a href="greeting?msg=hello">GET 통신</a>

</body>
</html>
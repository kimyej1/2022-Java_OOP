<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="num1" value="100"/>
	<c:set var="num2" value="100"/>
	<c:set var="result" value="${num1 + num2 }"/>
	${result} <br>
	
	<c:set var="array" scope="request">
	   yellow,blue,pink,red,green
	</c:set>
	${array} <br>
	
	<c:forEach begin="1" end="10">
		반복문 <br>
	</c:forEach>
	
	<c:forEach var="cnt" begin="1" end="10">
		${cnt} <br>
	</c:forEach>
	
	<c:forEach var="cnt" begin="1" end="10" step="2">
		${cnt} <br>
	</c:forEach>
	
	<c:forEach var="cnt" begin="1" end="5">
		<font size="${cnt}">반복문</font> <br>
	</c:forEach>
	
	<%-- 몇개 들었는지 모르니 begin/end 불필요.. --%>
	<c:forEach var="str" items="${array }"> 
		${str } <br>
	</c:forEach>
</body>
</html>
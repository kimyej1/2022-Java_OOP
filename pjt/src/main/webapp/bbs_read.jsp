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

<c:if test="${read != null}"> 	<%-- read가 null이 아닐 때 이걸 해줘 --%>
	${read.content }
</c:if>

<c:if test="${read == null}">	<%-- null일땐.. --%>
	No Data Found!
</c:if>

</body>
</html>
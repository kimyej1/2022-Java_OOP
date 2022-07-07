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
<c:forEach var="bbs" items="${bbs_list }">
	${bbs.idx } &nbsp;&nbsp; 
	<a href="bbs_read.kbstar?idx=${bbs.idx }">${bbs.subject }</a>&nbsp;&nbsp;
	${bbs.content }&nbsp;&nbsp;
	${bbs.writer }&nbsp;&nbsp;
	${bbs.regDate }&nbsp;&nbsp;
	${bbs.cnt }<br>
	
	<%-- 링크 걸기 (GET 방식)
		<a href=""><c:out value="" /></a> 
		<a href="<c:url value="">"></a>
	--%>
</c:forEach>

</body>
</html>
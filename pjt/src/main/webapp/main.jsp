<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" import="intro.news.NewsVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	Intro... KBStar
</div>
<hr>
<a href="bbs_list.kbstar?method=bbs">게시글 더보기 </a>
<hr/>
${lists }
<br>

<%
	List<Object> list = (List<Object>) request.getAttribute("lists");	// MainCtrl에 "list" 이름으로 setAttribute
	for(int idx=0; idx<list.size(); idx++) {
		Object obj = list.get(idx);
		out.println("<br/>");
		out.println(((NewsVO)obj).getMsg());	// down-casting
	}
%>
<br><br>

<c:forEach var="obj" items="${lists }">
	<%-- ${obj.idx} &nbsp;&nbsp;&nbsp; ${obj.msg }<br> --%>
	<c:out value="${obj.idx }"/>
	<c:out value="${obj.msg }"/><br>
</c:forEach>

</body>
</html>
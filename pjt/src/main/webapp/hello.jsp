<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="intro.news.NewsVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- HTML Comments -->
<%-- JSP Comments --%>
<%@ include file="header.jsp" %>
<%!
	private String id;	
	private NewsVO news;
	public String sayEcho(String msg) {
		return msg;
	}
%>

<%
	// Service Method
	String answer = sayEcho("JSP");
	out.print(answer);	// 표현식을 이용하지 않고, 여기서 출력해도 됨!
	
	news = new NewsVO();
	news.setIdx(1);
	news.setMsg("JSP Test");
%>

<%= answer %> <%-- 세미콜론 넣으면 오류 발생! --%>
<%= news.getMsg() %>
${news.msg }  <%-- EL은 백단(?)에서만 가능 --%>
</body>
</html>
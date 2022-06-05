<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.projectfiles.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4> Teacher Name</h4>
<br>
<form method="post" action="editTeacher1.jsp">
<input type="hidden" value="<%= request.getParameter("id")%>" name="id" >
<input type="text" value="<%= request.getParameter("name")%>" name="name">
<input type="submit">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.projectfiles.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Teacher</title>
</head>
<body>
<%
int id =Integer.parseInt(request.getParameter("id"));
deleteQuery obj = new deleteQuery();
obj.createconnection();
try{	
obj.deleteTeacher(id);
out.println("<h2>Teacher is deleted</h2>");
}catch(Exception e){
	out.println("<h3>Cannot be deleted because</h3>");
	out.println(e.getMessage());
}
obj.closeconn();
%>
</body>
</html>
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
<%
int id =Integer.parseInt(request.getParameter("id"));
String name =request.getParameter("name");
int classes =Integer.parseInt(request.getParameter("class"));
int teach =Integer.parseInt(request.getParameter("teacher"));
editQuery obj = new editQuery();
obj.createconnection();
try{	
obj.editSubject(id, name,classes,teach);
out.println("<h2>Subject is updated</h2>");
}catch(Exception e){
	out.println("<h3>Cannot be updated because</h3>");
	out.println(e.getMessage());
}
obj.closeconn();
%>
</body>
</html>
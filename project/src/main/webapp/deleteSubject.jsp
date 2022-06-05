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
deleteQuery obj = new deleteQuery();
obj.createconnection();
try{	
obj.deleteSubject(id);
out.println("<h2>Subject is deleted</h2>");
}catch(Exception e){
	out.println("<h3>Cannot be deleted because</h3>");
	out.println(e.getMessage());
}
obj.closeconn();
%>

</body>
</html>
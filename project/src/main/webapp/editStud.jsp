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
<form method="post" action="editStud1.jsp">
<input type="hidden" value="<%= request.getParameter("id")%>" name="id" >
<input type="text" value="<%= request.getParameter("name")%>" name="name">

Select Subject<select name="subject">
<%
try{	
	new_subject obj = new new_subject();
	obj.createconnection();
	List<subject> ls = obj.getAllSubject();
	obj.closeconn();
	for(subject ss:ls){
	%>
		<option value="<%=ss.get_sid() %>"><%=ss.get_stud_name()%></option>
	<%} 
	}catch(Exception e){
		out.println(e);
	}%>
</select>

<input type="submit">
</form>
</body>
</html>
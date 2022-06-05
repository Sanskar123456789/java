<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*,com.projectfiles.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<h3>Enter Subject details</h3>
<form action="insertStudent" method="post">
Name <input type="text" name="studentname" placeholder="Enter Student name"><br>
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
<br>
<br>
<input type="submit">
</form>


</body>
</html>
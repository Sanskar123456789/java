<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.projectfiles.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Subject</title>
</head>
<body>
<h3>Enter Subject details</h3>
<form action="insertsubject" method="post">
Name <input type="text" name="subjectname" placeholder="Enter Subject name"><br>
Select Class<select name="class">
<%
try{	
Classmethods obj = new Classmethods();
List<classstr> ls = obj.getAllTeacher();
for(classstr ss:ls){
%>
<option value="<%=ss.get_sid() %>"><%=ss.get_Class_name() %></option>
<%} 
}catch(Exception e){
	out.println(e);
}%>

</select>


Select Teacher<select name="teacher">
<%
try{	
new_teacher obj = new new_teacher();
obj.createconnection();
List<teacher> ls = obj.getAllTeacher();
for(teacher ss:ls){
%>
<option value="<%=ss.get_sid() %>"><%=ss.get_stud_name() %></option>
<%} 
}catch(Exception e){
	out.println(e);
}%>	

</select>

<input type="submit">
</form>


</body>
</html>
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
<form action="editSub1" method="post">
<input type="hidden" value="<%= request.getParameter("id")%>" name="id" >
Name <input type="text" value="<%= request.getParameter("name")%>" name="name">

Select Class<select name="class">
<%
try{
Classmethods obj = new Classmethods();
List<classstr> ls = obj.getAllTeacher();
for(classstr ss:ls){
	out.println(ss.get_Class_name()!=request.getParameter("c_name"));
	if(ss.get_Class_name()!=request.getParameter("c_name")){
	%>
		<option value="<%=ss.get_sid() %>"><%=ss.get_Class_name() %></option>
	<%}
	else{
	%>
		<option value="<%=ss.get_sid() %>" selected><%=ss.get_Class_name() %></option>
	<%}
	}
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
if(ss.get_stud_name()!=request.getParameter("t_name")){		
%>
	<option value="<%=ss.get_sid() %>"><%=ss.get_stud_name() %></option>
<%}
else{
%>
	<option value="<%=ss.get_sid() %>" selected><%=ss.get_stud_name() %></option>
<%}
}
}catch(Exception e){
	out.println(e);
}%>	

</select>

<input type="submit">
</form>


</body>
</html>
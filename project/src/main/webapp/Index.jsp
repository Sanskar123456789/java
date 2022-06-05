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

<a href="http://localhost:8080/project/student.jsp">New Student</a>
<a href="http://localhost:8080/project/teacher.html">New Teacher</a>
<a href="http://localhost:8080/project/sub.jsp">New Subject</a>
<a href="http://localhost:8080/project/class.html">New Class</a>
<h3>All Student details</h3>

<table>
<tr><th>Student Id </th><th>Student Name</th><th>  Subject Name</th><th>   Class Name</th><th>  Teacher Name</th></tr>
<%
try{	
	all_data obj = new all_data();
	obj.createconnection();
	List<struct> ls = obj.getAllStudent();
	obj.closeconn();
	for(struct ss:ls){
	%>
		<tr><td><%=ss.gets_id() %></td><td><%=ss.getStudent_name() %></td><td><%=ss.getSubject_name() %></td><td><%=ss.getClass_name() %></td><td><%=ss.getTeacher_name() %></td><td><a href="editStud.jsp?id=<%=ss.gets_id()%>&name=<%=ss.getStudent_name() %>">edit</a></td><td><a href="deleteStudent.jsp?id=<%=ss.gets_id()%>">delete</a></td></tr>
	<%} 
	}catch(Exception e){
		out.println(e);
	}%>
</table>

<h3>All Subject details</h3>
<table>
<tr><th>Subject Id </th><th>  Subject Name</th><th>   Class Name</th><th>  Teacher Name</th></tr>
<%
try{	
	all_data obj = new all_data();
	obj.createconnection();
	List<sub_structure> ls = obj.getAllSubject();
	obj.closeconn();
	for(sub_structure ss:ls){
	%>
		<tr><td><%=ss.getStudent_name() %></td><td><%=ss.getSubject_name() %></td><td><%=ss.getClass_name() %></td><td><%=ss.getTeacher_name() %></td><td><a href="editsub.jsp?id=<%=ss.getStudent_name()%>&c_name=<%=ss.getClass_name() %>&t_name=<%=ss.getTeacher_name()%>&name=<%=ss.getSubject_name()%>">edit</a></td><td><a href="deleteSubject.jsp?id=<%=ss.getStudent_name()%>">delete</a></td></tr>
	<%} 
	}catch(Exception e){
		out.println(e);
	}%>
</table>

<h3>All Class details</h3>
<table>
<tr><th>Class Id </th><th>  Class Name</th></tr>
<%
try{	
	all_data obj = new all_data();
	obj.createconnection();
	List<Class_struct> ls = obj.getAllClass();
	obj.closeconn();
	for(Class_struct ss:ls){
	%>
		<tr><td><%=ss.gett_id() %></td><td><%=ss.getTeacher() %></td><td><a href="editClass.jsp?id=<%=ss.gett_id()%>&name=<%=ss.getTeacher() %>">edit</a></td><td><a href="deleteClass.jsp?id=<%=ss.gett_id()%>">delete</a></td></tr>
	<%} 
	}catch(Exception e){
		out.println(e);
	}%>
</table>

<h3>All Teacher details</h3>
<table>
<tr><th>Teacher Id </th><th>  Teacher Name</th><th></th><th></th></tr>
<%
try{	
	all_data obj = new all_data();
	obj.createconnection();
	List<teacher_struct> ls = obj.getAllTeacher();
	obj.closeconn();
	for(teacher_struct ss:ls){
	%>
		<tr><td><%=ss.gett_id() %></td><td><%=ss.getTeacher() %></td><td><a href="editTeacher.jsp?id=<%=ss.gett_id()%>&name=<%=ss.getTeacher() %>">edit</a></td><td><a href="deleteTeacher.jsp?id=<%=ss.gett_id()%>">delete</a></td></tr>
	<%} 
	}catch(Exception e){
		out.println(e);
	}%>
</table>


</body>
</html>
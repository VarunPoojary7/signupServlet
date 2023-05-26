<%@page import="java.util.List"%>
<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Student student = (Student) request.getAttribute("student");
	%>
	<table border=1>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>Password</td>
			<td>Gender</td>
			<td>Delete</td>
			<td>Edit</td>
		</tr>

		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getMobile()%></td>
			<td><%=student.getPassword()%></td>
			<td><%=student.getGender()%></td>
			<td><a href="delete?id=<%=student.getId()%>"><button>Delete</button></a></td>
			<td><button>Edit</button>
		</tr>




	</table>
</body>
</html>




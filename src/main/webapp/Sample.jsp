<%@page import="java.util.Arrays"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample</title>

<style type="text/css">

h1{
color:oilred;

}

body{
background: rgb(18,52,224);
background: radial-gradient(circle, rgba(18,52,224,1) 0%, rgba(236,15,60,1) 100%);;
}

</style>
</head>
<body>

          <%-- types of tags in jsp
          
               1.<% script tag%>  
               2.<%! declarative tag %>
               3.<%= Expression tag %>
               4.<%-- comment tag 
               5.<%@ Directive tag %>
          --%>
          
  
 <h1>Hey this is HTML......!</h1>
  
  
<% System.out.println("Hi i am java......!");%>

<%! int a=5; %> <%-- Global Variable --%>

<% int b=6; %> <%-- Local Variable --%>

<%!
     void add(){
	 System.out.println("Hey...");
     }
%>

   <%-- By this we can include another html in here --%>
   
<%@include file="index1.jsp"%>


<%
    add();
    System.out.println(this.a);
%>


<%--   <% response.getWriter().print(a); %> --%>

  <h1><%= a %></h1>
  
  <% String n="Puattanna Kangal"; %>
  
  <h1><%= n %></h1>
  
<%
    List l=Arrays.asList(1,2,3,4,5,6);
    System.out.println(l);
    
%>
   
 <h1><%=l %></h1>  
   
</body>
</html>

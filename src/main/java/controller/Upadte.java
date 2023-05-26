package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet
public class Upadte extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	String password=req.getParameter("password");
	String email=req.getParameter("email");
	
	Student student=new Student();
	student.getId();
	student.getEmail();
	student.getPassword();
	student.getMobile();
	student.getName();
	
	Studentdao studentdao=new Studentdao();
	studentdao.update(student);
	
	resp.getWriter().print("<h1>updated succesful</h1>");
	req.getRequestDispatcher("home.html").include(req, resp);
	}

}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("")
public class Loginservlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Studentdao dao=new Studentdao();
		Student student=dao.fetch(email);
		
		
		
		
		if (student==null)
		{
			resp.getWriter().print("<h1> Invalid Email</h1>");
		}
		else {
			if(student.getPassword().equals(password))
			{ 
				resp.getWriter().print("<h1>Login sucess</h1>");
			
			}
			else
			{
				resp.getWriter().print("<h1>Invalid password</h1>");
				
			}
			
		}
	}
}
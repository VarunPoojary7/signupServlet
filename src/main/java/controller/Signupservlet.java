package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.Student;

@WebServlet("/signUp")
public class Signupservlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		long mobile=Long.parseLong(req.getParameter("mobile"));
		String password=req.getParameter("password");
		
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setGender(gender);
		student.setMobile(mobile);
		student.setPassword(password);
		
		Studentdao dao=new Studentdao();
		dao.save(student);
		
		resp.getWriter().print("<html><body style=><h1 style='color:#AD4328'>SignUp Successfull!"+"</h1></body></html>");
	
		req.getRequestDispatcher("login.html").include(req, resp);
	}

}
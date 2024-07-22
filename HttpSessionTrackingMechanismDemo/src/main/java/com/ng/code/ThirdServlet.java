package com.ng.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo3")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	
	String ph=request.getParameter("ph");
	String clg=request.getParameter("clg");
	int marks=Integer.parseInt(request.getParameter("marks"));
	
	//getting the session object
	
	
	//getting data stored in httpsession
	
	pw.print("<center>");
	pw.print("<table border='1'>");
	pw.print("<tr><th>name</th><td>"+name+"</td></tr>");
	pw.print("<tr><th>email</th><td>"+email+"</td></tr>");
	pw.print("<tr><th>phone</th><td>"+ph+"</td></tr>");
	pw.print("<tr><th>college</th><td>"+clg+"</td></tr>");
	pw.print("<tr><th>marks</th><td>"+marks+"</td></tr>");
	pw.print("</center");
	
	}

}

package com.ng.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.print("<center><form action='"+response.encodeURL("./demo2")+"'>");
		pw.print("<table>");
		pw.print("<tr>\r\n"

				
				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='name' value="+name+"/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				
				+ "<tr>\r\n"
				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='email' value="+email+"/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"

				+ "<th>phone no:</th>\r\n"
				+ "<td><input type=\"text\" name=\"ph\"/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				+ "<tr>\r\n"
				+ "<th>college</th>\r\n"
				+ "<td><input type=\"text\" name=\"clg\"/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<tr>\r\n"
				+ "<th></th>\r\n"
				+ "<td><input type=\"submit\" value=\"next\"/></td>\r\n"
				+ "</tr>\r\n"
				+ "");
		
		

	}

}

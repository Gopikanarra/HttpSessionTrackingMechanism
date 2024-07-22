package com.ng.code;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		String ph=request.getParameter("ph");
		String clg=request.getParameter("clg");
		
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<center><form action='"+response.encodeURL("./demo3")+"'>");
pw.print("<tr>\r\n"

				
				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='name' value='"+name+"'/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				
				+ "<tr>\r\n"
				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='email' value='"+email+"'/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"

				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='ph' value='"+ph+"'/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				+ "<tr>\r\n"
				+ "<th></th>\r\n"
				+ "<td><input type='hidden' name='clg' value='"+clg+"'/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<tr>\r\n"
				+ "</tr>\r\n"
				+ "<th>marks</th>\r\n"
				+ "<td><input type=\"text\" name=\"marks\"/></td>\r\n"
				+ "</tr>\r\n"
				+ "\r\n"
				+ "<tr>\r\n"
				+ "<th></th>\r\n"
				+ "<td><input type=\"submit\" value=\"next\"/></td>\r\n"
				+ "</tr>");

	}
	
}

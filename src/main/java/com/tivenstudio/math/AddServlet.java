package com.tivenstudio.math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		double a = Double.parseDouble(req.getParameter("value1"));
		double b = Double.parseDouble(req.getParameter("value2"));

		double result = a + b;


		Cookie cookie = new Cookie("cos",result +"");
		resp.addCookie(cookie);
		
		
		resp.sendRedirect("square");
		

		//RequestDispatcher rd = req.getRequestDispatcher("square");
		//rd.forward(req, resp);

		PrintWriter out = resp.getWriter();
		out.println("Result is : " + result);

	}

}

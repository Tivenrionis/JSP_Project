package com.tivenstudio.math;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double transfered = Double.parseDouble(req.getParameter("cos"));
		
		
		
		
		PrintWriter out = resp.getWriter();
		out.println(transfered*transfered);
		
	}

}

package com.tivenstudio.math;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		double transfered=0;
		
		Cookie[] cookies = req.getCookies();
		
		
		for (Cookie c : cookies) {

			if(c.getName().equals("cos"))
			{
				transfered = Double.parseDouble(c.getValue());
			}
		}

		PrintWriter out = resp.getWriter();
		out.println(transfered * transfered);

	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	 
		private static final long serialVersionUID = 1L;
		
		public void doGet(HttpServletRequest request,HttpServletResponse response)
		{
			try
			{
				PrintWriter writer = response.getWriter();
				writer.print("<html><head></head><body><h1>Second Servlet</h1></body></html>");
				
			}catch(IOException e)
			{
				
			}
		}

}

package com.cherry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("n1");
		String pass=req.getParameter("p1");
		System.out.println(name + " " + pass);
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body><h1>" + name + " \n" +pass + "</h1></body></html>");
	}

}

package com.loga.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;   
	private HashMap<String,String> users = new HashMap<>();
    public loginservlet() {
        super();
       
    }
    
    
    @Override

	public void init(ServletConfig config)throws ServletException{
		context = config.getServletContext();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String username= req.getParameter("username");
		String password= req.getParameter("password");
		
		users = (HashMap<String,String>)context.getAttribute("usersData");
		
		if(users.containsKey(username)) {
			if(users.get(username).equals(password)) {
				out.println("<h1>Welcome: </h1>"+username);
			}
			else {
				out.println("<h3>Invalid credentials</h3>");
				out.println("<br><br><a href='login.html'>Try again</a>");
			}
		}
		else {
			out.println("<h3>User does not exist</h3>");
			out.println("<br><br><a href='login.html'>Try again</a>");
		}
		out.close();	}

}

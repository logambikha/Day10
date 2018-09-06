package com.loga.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employee")
public class EmployeeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee>emp= new ArrayList<>();
	
	
	private ServletContext context;  
      
    
    public EmployeeControllerServlet() {
        super();
    }
    @Override
    public void init(ServletConfig config)throws ServletException{
		context = config.getServletContext();
		emp.add(new Employee("1234","Abi",4566,"rt"));
		emp.add(new Employee("174","Adrt",5477,"rtrdty"));
		emp.add(new Employee("123","Asdfni",2354,"sdf"));
		emp.add(new Employee("134","dcgji",2357,"xgc"));
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id= request.getParameter("id");
		boolean found=true;
		for(Employee employee : emp)
		{
			if(employee.getid().equals(id)) {
				out.println("<table border='1' align='center'> <tr> <th>ID</th> <th>Name</th> <th>Salary</th>  <th>Department</th>  ");
				out.println("<tr><td>"+employee.getid()+"<td>"+employee.getName()+"<td>"+employee.getSalary()+"<td>"+employee.getDepartment()); 
		found=true;
	}
			if(!found) {
				out.println("Employee doesnot exist");
			}

}}}

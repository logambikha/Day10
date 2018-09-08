package com.loga.employeeapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loga.employeeapp.dao.EmployeeDao;
import com.loga.employeeapp.domain.Employee;

@WebServlet("/displayEmployees")
public class DisplayEmployeeDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	private EmployeeDao employeeDao;

	public DisplayEmployeeDetailsController() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");
		List<Employee> employees = employeeDao.findAllEmployees();
		RequestDispatcher dispatcher = null;

		request.setAttribute("employeeList", employees);

		dispatcher = request.getRequestDispatcher("displayAllEmployees.jsp");
		dispatcher.forward(request, response);
	}

}
package com.loga.employeeapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.loga.employeeapp.model.Employee;
import com.loga.employeeapp.model.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		for(Employee employee : employees)
		{
			if(employee.getEmployeeId() == employeeId) {
				employees.remove(employees);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

package com.loga.employeeapp.model;

import java.util.List;

public interface EmployeeDao {
	public List<Employee> findAllEmployees();
	public Employee findEmployeeById(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public boolean addEmployee(int employeeId);
	public Employee updateEmployee(Employee employee);
	

}

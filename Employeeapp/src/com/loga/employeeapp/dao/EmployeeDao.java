package com.loga.employeeapp.dao;

import java.util.List;

import com.loga.employeeapp.domain.Employee;

public interface EmployeeDao {
	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(long employeeId);

	public boolean deleteEmployee(long employeeId);

	public boolean addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);


}

package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Employee;

public interface EmployeeDAO {
	
	//List of All Employees
	
	public List<Employee> getAllEmployees();
	
	//Add an Employee
	
	public void addEmployee(Employee employee);
	
	//Delete an Employee
	
	public void deleteEmployee(int id);
	
	//Update and Employee
	
	public Employee updateEmployee(Employee employee);
	
	//Get an employee
	
	public Employee getEmployee(int id);

}

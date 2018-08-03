package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Employee;

public interface EmployeeService {
	
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public void addEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	public Employee updateEmployee(Employee employee);
	

}

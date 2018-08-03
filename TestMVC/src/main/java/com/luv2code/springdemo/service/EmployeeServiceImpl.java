package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.EmployeeDAO;
import com.luv2code.springdemo.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	public EmployeeDAO empdao;

	@Transactional
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empdao.getAllEmployees();
	}

	@Transactional
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return empdao.getEmployee(id);
	}

	@Transactional
	public void addEmployee(Employee employee) {
		
		empdao.addEmployee(employee);

	}

	@Transactional
	public void deleteEmployee(int id) {
		empdao.deleteEmployee(id);

	}
	
	@Transactional
	public Employee updateEmployee(Employee emp) {
		return empdao.updateEmployee(emp);
	}

}

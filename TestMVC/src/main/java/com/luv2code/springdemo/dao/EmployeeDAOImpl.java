package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	public SessionFactory sessionFactory;

	public List<Employee> getAllEmployees() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> employees = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> allEmployees = employees.getResultList();

		return allEmployees;
	}

	public void addEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(employee);

	}

	public void deleteEmployee(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Employee employee =currentSession.get(Employee.class, id);
		if(employee != null) {
			currentSession.delete(employee);
		}

	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(employee);
		return employee;
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Employee employee =currentSession.get(Employee.class, id);
		return employee;
	}

}

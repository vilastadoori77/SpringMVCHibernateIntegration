package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Employee;
import com.luv2code.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	public EmployeeService empService;
	
	@GetMapping("/all")
	public String listEmployees(Model theModel) {
		
		//Get the customers from the Employee Service
		
		List<Employee> listallemp = empService.getAllEmployees();
		
		//print all the employees to the console
		
		for(Employee emp : listallemp) {
			System.out.println("ID" + " "+emp.getId());
			System.out.println("First Name" + " "+emp.getFirst_name());
			System.out.println("Last Name" + " "+emp.getLast_name());
			System.out.println("Email" + " "+emp.getEmail());
			System.out.println("Address" + " "+emp.getAddress());
			System.out.println("Telephone" + " "+emp.getTelephone());
		}
		
		//Add the employees to the Spring MVC Model
		
		theModel.addAttribute("listallemp", listallemp);
		
		return "list_employees";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showForm(Model theModel) {
		
		
		Employee employee = new Employee();
		
		theModel.addAttribute("employee", employee);

	
		return "employee-form";
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		
			empService.addEmployee(employee);
		
		
		return "redirect:all";
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateEmployee(@RequestParam("employeeId") int id, Model themodel) {
		
		
		Employee employee = empService.getEmployee(id);
		
		themodel.addAttribute("employee", employee);
		
		
		return "employee-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int id, Model themodel) {
		
		empService.deleteEmployee(id);
		
		return "redirect:all";
		
	}
	
	

}

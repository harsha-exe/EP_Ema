package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Employee;

@Remote
public interface EmployeeServices {
	public String addEmployee(Employee emp);
	public String deleteEmployee(int id);
	public List<Employee> viewAllEmployees();
	public Employee viewEmployeeById(int id);
	public String updateEmployee(Employee e);
	
}

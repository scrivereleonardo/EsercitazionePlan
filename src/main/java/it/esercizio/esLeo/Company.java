package it.esercizio.esLeo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.esercizio.esLeo.Employee;


public class Company {
	
	///forse Da Eliminare?
	List<Employee> employees;
	Map<Employee, TimeBank> empTotalSalary;

	public Company(List<Employee> employees, Map<Employee, TimeBank> empTotalSalary) {
		super();
		this.employees = new ArrayList<>();
		this.empTotalSalary = new HashMap<>();
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}




}

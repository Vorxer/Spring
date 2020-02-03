package com.dinura.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.dinura.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setEmployeeName("Luke");
		employee.setEmployeeLocation("Alderan");
		employees.add(employee);
		return employees;
	}
}

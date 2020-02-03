package com.dinura.training.salesmanager.service;

import java.util.List;
import com.dinura.training.salesmanager.model.Employee;
import com.dinura.training.salesmanager.repository.EmployeeRepository;
import com.dinura.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
}

package com.dinura.training.salesmanager.service;

import java.util.List;
import com.dinura.training.salesmanager.model.Employee;
import com.dinura.training.salesmanager.repository.EmployeeRepository;
import com.dinura.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl() {
		System.out.println("Autowired Construtor Executed");
	}

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overloaded Construtor Executed");
		this.employeeRepository = employeeRepository;
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter Injection Fired");
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}
}

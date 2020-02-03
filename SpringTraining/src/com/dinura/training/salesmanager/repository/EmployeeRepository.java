package com.dinura.training.salesmanager.repository;

import java.util.List;

import com.dinura.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}
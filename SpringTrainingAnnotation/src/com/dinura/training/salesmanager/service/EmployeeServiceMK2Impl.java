package com.dinura.training.salesmanager.service;

import com.dinura.training.salesmanager.model.Employee;
import com.dinura.training.salesmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeServiceMK2")
public class EmployeeServiceMK2Impl implements EmployeeServiceMK2 {

    //@Autowired
    //EmployeeRepository employeeRepository;

    public EmployeeServiceMK2Impl() {
        System.out.println("Autowired Construtor Executed");
    }

    @Autowired
    public EmployeeServiceMK2Impl(EmployeeRepository employeeRepository) {
        System.out.println("Overloaded Construtor Executed from MK2");
        //this.employeeRepository = employeeRepository;
    }

    //public EmployeeRepository getEmployeeRepository() {
    //    return employeeRepository;
    //}

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter Injection Fired from MK2");
        //this.employeeRepository = employeeRepository;
    }

    //public List<Employee> getAllEmployees(){
       // return employeeRepository.getAllEmployees();
    //}
}
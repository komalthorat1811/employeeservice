package com.microservice.employeeservice.service;

import com.microservice.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    Object getDepartments();

    Object getDepartmentById(Integer employeeId);
}

package com.microservice.employeeservice.controller;

import com.microservice.employeeservice.model.Employee;
import com.microservice.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList;
    }

    @GetMapping("/departments")
    public Object getDepartments(){
        return employeeService.getDepartments();
    }

    @GetMapping("/departments/{employeeId}")
    public Object getDepartments(@PathVariable Integer employeeId){
        return employeeService.getDepartmentById(employeeId);
    }
}

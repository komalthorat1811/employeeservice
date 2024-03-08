package com.microservice.employeeservice.service;

import com.microservice.employeeservice.model.Employee;
import com.microservice.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Object getDepartments() {
        return restTemplate.getForObject("http://department-ms/departments",Object.class);
    }

    @Override
    public Object getDepartmentById(Integer employeeId) {
        return restTemplate.getForObject("http://department-ms/departments/"+employeeId,Object.class);
    }
}

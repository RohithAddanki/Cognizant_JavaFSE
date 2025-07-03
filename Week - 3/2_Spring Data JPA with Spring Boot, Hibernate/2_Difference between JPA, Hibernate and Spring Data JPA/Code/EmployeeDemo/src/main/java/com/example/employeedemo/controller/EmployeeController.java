package com.example.employeedemo.controller;

import com.example.employeedemo.entity.Employee;
import com.example.employeedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create employee using Spring Data JPA
    @PostMapping("/springdata")
    public String addEmployeeSpringData(@RequestBody Employee employee) {
        Integer id = employeeService.addEmployeeWithSpringDataJPA(employee);
        return "Employee saved with Spring Data JPA, ID: " + id;
    }

    // Create employee using Hibernate native
    @PostMapping("/hibernate")
    public String addEmployeeHibernate(@RequestBody Employee employee) {
        Integer id = employeeService.addEmployeeWithHibernate(employee);
        return "Employee saved with Hibernate, ID: " + id;
    }
}
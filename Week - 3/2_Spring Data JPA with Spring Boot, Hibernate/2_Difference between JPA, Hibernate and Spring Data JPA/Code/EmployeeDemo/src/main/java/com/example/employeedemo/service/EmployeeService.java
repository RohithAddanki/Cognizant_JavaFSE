package com.example.employeedemo.service;

import com.example.employeedemo.entity.Employee;
import com.example.employeedemo.hibernate.EmployeeHibernateDao;
import com.example.employeedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    // Spring Data JPA repo
    @Autowired
    private EmployeeRepository employeeRepository;

    // Hibernate native DAO
    private EmployeeHibernateDao hibernateDao = new EmployeeHibernateDao();

    @Transactional
    public Integer addEmployeeWithSpringDataJPA(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee.getId();
    }

    public Integer addEmployeeWithHibernate(Employee employee) {
        return hibernateDao.addEmployee(employee);
    }
}
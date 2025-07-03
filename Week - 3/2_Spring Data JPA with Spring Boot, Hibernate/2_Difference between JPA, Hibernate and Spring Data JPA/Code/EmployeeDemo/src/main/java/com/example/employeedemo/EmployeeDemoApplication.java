package com.example.employeedemo;

import com.example.employeedemo.entity.Employee;
import com.example.employeedemo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDemoApplication.class, args);
    }

    // This will run after the application starts
    @Bean
    CommandLineRunner displayEmployees(EmployeeRepository employeeRepository) {
        return args -> {
            System.out.println("\n📋 All Employees in the Database:\n");

            for (Employee emp : employeeRepository.findAll()) {
                System.out.println("🆔 ID: " + emp.getId());
                System.out.println("👤 Name: " + emp.getName());
                System.out.println("🏢 Department: " + emp.getDepartment());
                System.out.println("💰 Salary: " + emp.getSalary());
                System.out.println("--------------------------------------");
            }

            if (employeeRepository.findAll().isEmpty()) {
                System.out.println("🚫 No employees found in the database.");
            }
        };
    }
}
# 🧪 EmployeeDemo - Spring Data JPA Quick Example

## 📘 Project Summary

This is a simple Spring Boot project demonstrating the integration of Spring Data JPA with MySQL to perform basic ORM (Object Relational Mapping) operations for employee management.

### ✅ Features

- 🛠️ Spring Boot setup via Spring Initializr  
- 🐬 Integration with MySQL Database  
- 🧩 ORM using Spring Data JPA and Hibernate  
- 🏷️ Employee entity and repository interface creation  
- 📜 REST APIs for adding and fetching employees  
- 📋 Logs employee data on application startup  

---

## ▶️ How to Run

1. 🚀 Import the project into **Spring Tool Suite (STS)** or any compatible IDE.  
2. 🐬 Ensure **MySQL** is running and the database `employeedb` is created.  
3. 🔐 Update the database credentials in `src/main/resources/application.properties`.  
4. ▶️ Run the main class: `EmployeeDemoApplication.java`.  
5. ✅ If successful, your console will output something like:



##📋 All Employees in the Database:

🆔 ID: 1
👤 Name: John Doe
🏢 Department: IT
💰 Salary: 50000.0



---

## 🛠️ Database Setup (MySQL)

Run these commands in MySQL CLI or Workbench:

```sql
CREATE DATABASE employeedb;

USE employeedb;

CREATE TABLE employee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  department VARCHAR(255),
  salary DOUBLE
);
```

##🧰 Technologies Used
- ☕ Java 21
- 🌱 Spring Boot 3.5.3
- 📦 Spring Data JPA
- 🐘 Hibernate
- 🐬 MySQL 8.x
- 🛠️ Maven

---


##👨‍💻 Author
Rohith Addanki

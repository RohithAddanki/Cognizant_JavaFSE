# 🧪 Spring Data JPA - Quick Example

## 📘 Project Summary

This is a basic Spring Boot project demonstrating the integration of Spring Data JPA with MySQL to perform simple ORM (Object Relational Mapping) operations.

### ✅ Features

- 🛠️ Spring Boot setup via Spring Initializr  
- 🐬 Integration with MySQL Database  
- 🧩 ORM using Spring Data JPA and Hibernate  
- 🏷️ Entity and Repository interface creation  
- 📜 Fetch and log records using Spring Data JPA Repository  

---

## ▶️ How to Run

1. 🚀 Import the project into **Spring Tool Suite (STS)** or any compatible IDE.  
2. 🐬 Ensure **MySQL** is running and the database + table are created.  
3. 🔐 Update the database credentials in `src/main/resources/application.properties`.  
4. ▶️ Run the main class: `OrmLearnApplication.java`.  
5. ✅ If successful, your console will output something like:



## Inside main
- Start
- Countries: [Country [code=IN, name=India], Country [code=US, name=United States of America]]
- End



---

## 🛠️ Database Setup (MySQL)

Run the following commands in your MySQL CLI or GUI (like MySQL Workbench):

```sql
CREATE DATABASE orm_example;

USE orm_example;

CREATE TABLE country (
  code CHAR(2) PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);

INSERT INTO country (code, name) VALUES
('IN', 'India'),
('US', 'United States of America');

```

##🧰 Technologies Used
☕ Java 21

🌱 Spring Boot 3.5.3

📦 Spring Data JPA

🐘 Hibernate

🐬 MySQL 8.x

🛠️ Maven

---

## 👨‍💻Author
Rohith Addanki

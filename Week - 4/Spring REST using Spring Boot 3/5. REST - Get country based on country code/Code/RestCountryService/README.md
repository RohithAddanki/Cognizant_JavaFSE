# 🧪 Exercise: REST - Get Country by Code

## 📘 Project Summary
This Spring Boot REST API returns country details based on a case-insensitive country code using Spring Core XML bean configuration.

---

## ▶️ How to Run
1. 🚀 Import the project into **Spring Tool Suite (STS)**
2. ▶️ Run `SpringLearnApplication.java`
3. 🌐 Access in browser or Postman:  
   `http://localhost:8085/countries/in`

---

## 🔧 REST Endpoint

```text
| Method | URL                      | Response (JSON)                |
|--------|--------------------------|--------------------------------|
| GET    | `/countries/{code}`      | `{"code":"IN","name":"India"}` |
```
- **Controller:** `CountryController`
- **Service:** `CountryService`
- **Bean Source:** `country.xml`

---

## 🧩 Project Structure
```text
RestCountryService/
├── src/
│ ├── main/java/com/cognizant/spring_learn/
│ │ ├── controller/CountryController.java
│ │ ├── model/Country.java
│ │ ├── service/CountryService.java
│ │ └── SpringLearnApplication.java
│ └── resources/
│ ├── country.xml
│ └── application.properties
└── pom.xml
```


---

## 🛠️ Technologies
- ☕ Java 21  
- 🌱 Spring Boot  
- 🧵 Spring Web & Core (XML)  
- 🧪 SLF4J (Logback)  
- 🖥️ STS  
- 📦 Maven

## 👨‍💻 Author
Rohith Addanki
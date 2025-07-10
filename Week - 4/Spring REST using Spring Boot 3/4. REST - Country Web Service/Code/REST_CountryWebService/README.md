# 🌍 Exercise: REST - Country Web Service

## 📘 Project Summary
This project demonstrates how to expose a RESTful endpoint using Spring Boot that returns a `Country` bean configured via Spring XML.

---

## ▶️ How to Run
1. 🚀 Import project into **Spring Tool Suite (STS)**
2. ▶️ Run `SpringLearnApplication.java`
3. 🌐 Access: [http://localhost:8084/country](http://localhost:8084/country)

---

## 🔧 REST Endpoint Details

```text
| Method | URL       | Response                  |
|--------|-----------|---------------------------|
| GET    | /country  | {"code":"IN","name":"India"} |
```

- **Controller Class:** `CountryController`  
- **Package:** `com.cognizant.spring_learn.controller`  
- **Method:** `public Country getCountryIndia()`

## 📂 Project Structure
```text
REST_CountryWebService/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cognizant/spring_learn/
│       │       ├── SpringLearnApplication.java
│       │       ├── controller/
│       │       │   └── CountryController.java
│       │       └── model/
│       │           └── Country.java
│       └── resources/
│           ├── application.properties
│           └── country.xml
└── pom.xml
```

##🛠️ Technologies Used
 -☕ Java 21

 -🌱 Spring Boot

 -🔌 Spring Web

 -⚙️ Spring Core XML

 -📦 Maven

 -🖥️ Spring Tool Suite (STS)

 -🌐 Testing the API


##🔍 Browser
URL: http://localhost:8084/country

##🔍 Postman
-Method: GET

-URL: http://localhost:8084/country

-Headers:

-Content-Type: application/json

-✅ Response:
json
{
  "code": "IN",
  "name": "India"
}


##👨‍💻 Author
Rohith Addanki
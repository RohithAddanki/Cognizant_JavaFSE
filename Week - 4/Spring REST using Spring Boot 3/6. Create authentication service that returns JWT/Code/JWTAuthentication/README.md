# 🔐 Exercise: JWT Authentication Service

## 📘 Project Summary
This project demonstrates how to create a basic **JWT Authentication Service** using Spring Boot and Spring Security.  
When valid credentials are sent via a `GET` request, the application generates and returns a **JWT token**.

---

## ▶️ How to Run
1. 🚀 Import the project into **Spring Tool Suite (STS)**
2. ▶️ Run `JwtAuthenticationApplication.java`
3. 🌐 Use `curl` or Postman to call the API  
   `GET http://localhost:8086/authenticate` with Basic Auth (`user:pwd`)

---

## 🔧 REST Endpoint Details
```text
| Method | URL                     | Authentication | Response                     |
|--------|-------------------------|----------------|------------------------------|
| GET    | `/authenticate`         | Basic Auth     | `{ "token": "<JWT Token>" }` |
```
- **Controller Class:** `AuthenticationController`  
- **Security Config Class:** `SecurityConfig`  
- **JWT Utility Class:** `JwtUtil`

---

## 🧪 Example Usage

### 🔄 cURL Command:
```bash
curl -s -u user:pwd http://localhost:8086/authenticate
```


##🔄 Postman:
- **Method:** GET

- **URL:** http://localhost:8086/authenticate

- **Auth:** Basic Auth

- **Username:** user

- **Password:** pwd



##✅ Sample Response:
```text
 json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```


##📂 Project Structure
```text
JWTAuthentication/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cognizant/jwt_authentication/
│       │       ├── JwtAuthenticationApplication.java
│       │       ├── controller/
│       │       │   └── AuthenticationController.java
│       │       ├── config/
│       │       │   └── SecurityConfig.java
│       │       └── util/
│       │           └── JwtUtil.java
│       └── resources/
│           └── application.properties
└── pom.xml
```


##⚙️ Technologies Used
 - ☕ Java 21

 - 🌱 Spring Boot

 - 🔐 Spring Security

 - 🪪 JWT (JSON Web Token)

 - 📦 Maven

 - 🖥️ Spring Tool Suite (STS)
 
##👨‍💻 Author
Rohith Addanki
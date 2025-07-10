# 🧪 Exercise: Hello World RESTful Web Service

## 📘 Project Summary
This project demonstrates how to build a basic RESTful web service using Spring Boot and Spring Web. The service exposes a `GET` endpoint that returns the string `"Hello World!!"`.

---

## ▶️ How to Run
1. 🚀 Import the project into **Spring Tool Suite (STS)**
2. ▶️ Run `SpringLearnApplication.java` from `com.cognizant.spring_learn`
3. 🌐 Open browser or Postman and access:  
   `http://localhost:8083/hello`
4. ✅ You will see the response:  
   `Hello World!!`

---

## 🔧 REST Endpoint Details

**Endpoint Overview:**

```text
| Method | URL     | Response       |
|--------|---------|----------------|
| GET    | /hello  | Hello World!!  |
```
- **Controller Class:** `HelloController`  
- **Package:** `com.cognizant.spring_learn.controller`  
- **Method:** `public String sayHello()`

---

## 📂 Project Structure

```text
HelloWorld_RESTful_WebService/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/cognizant/spring_learn/
│       │       ├── HelloWorldRESTfulWebServiceApplication.java
│       │       └── controller/
│       │           └── HelloController.java
│       └── resources/
│           └── application.properties
└── pom.xml

```
---



## 📄 Configuration

### `application.properties`
```properties
server.port=8083
logging.level.com.cognizant.spring_learn=INFO
```


##🌐 Testing the API
🔍 Using Browser
Visit: http://localhost:8083/hello

🔍 Using Postman
Method: GET

URL: http://localhost:8083/hello

Response: "Hello World!!"

##📋 HTTP Header Inspection
Chrome Developer Tools
Press F12 → Network → Reload /hello

Click on /hello → Check the Headers tab

Postman
Send the request

View the Headers tab for response details

##🛠️ Technologies Used
☕ Java 21

🌱 Spring Boot

🔌 Spring Web

🖥️ Spring Tool Suite (STS)

📦 Maven

📑 SLF4J (Logback)

##👨‍💻 Author
Rohith Addanki
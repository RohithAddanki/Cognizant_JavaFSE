# Exercise: Loan Microservice with List and Detail Endpoints

## 📘 Project Summary
This Spring Boot microservice returns dummy loan account data for a banking application.  
It provides:
- 📌 Loan details by loan number
- 📋 List of all available loan accounts

## ▶️ How to Run
1. 🚀 Import the project into Spring Tool Suite (STS)
2. ▶️ Run `LoanApplication.java`
3. 🌐 Access the following REST endpoints via browser or Postman:
   - 🔹 `http://localhost:9091/loans` – Get all loans
   - 🔹 `http://localhost:9091/loans/{number}` – Get specific loan details

## 🔗 Sample Response
**GET /loans/H00987987972342**

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

##🛠️ Technologies
- ☕ Java 17
- 🌱 Spring Boot
- 🌐 Spring Web
- 🔧 Spring Boot DevTools
- 📦 Maven

##⚙️ Configuration
**📄 application.properties contains:**
 
```text
server.port=9091
```

##👨‍💻 Author
 - Rohith Addanki
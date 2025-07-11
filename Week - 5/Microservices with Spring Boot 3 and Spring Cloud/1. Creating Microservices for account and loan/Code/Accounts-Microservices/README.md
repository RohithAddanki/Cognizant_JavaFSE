# Exercise: Account Microservice with List and Detail Endpoints

## 📘 Project Summary
This Spring Boot microservice provides dummy account details for banking applications.  
It supports fetching either a single account by number or all available accounts.

## ▶️ How to Run
1. 🚀 Import the project into Spring Tool Suite (STS)
2. ▶️ Run `AccountApplication.java`
3. 🌐 Access endpoints in browser or Postman:
   - 🔹 `http://localhost:9090/accounts` – List all accounts
   - 🔹 `http://localhost:9090/accounts/{number}` – Get account by number

## 🔗 Sample Response  
**GET /accounts/00987987973432**

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
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
server.port=9090
```
##👨‍💻 Author
 - Rohith Addanki
# Spring Boot Authentication and Authorization System

A Spring Boot-based authentication and authorization system using:

- Spring Security
- JWT (JSON Web Tokens)
- Role-Based Access Control (RBAC)
- Secure password hashing with BCrypt

## 🔐 Features

- User Registration & Login
- JWT Token generation and validation
- Role-based authorization
- Secure APIs with Spring Security
- Exception handling and error responses
- Logout functionality (token blacklist optional)

## 🚀 Technologies

- Java 17+
- Spring Boot
- Spring Security
- JWT
- Maven
- PostgreSQL

## 🛠️ Setup & Run

### 1. Clone the repo

```bash
git clone https://github.com/your-username/spring-boot-auth-system.git
cd spring-boot-auth-system
```

### 2. Configure Database

```java
spring.datasource.url=jdbc:postgresql://localhost:5432/your db
spring.datasource.username=postgres
spring.datasource.password=yourpassword

jwt.secret=yourSecretKey

```

### 3. Run the project

```bash
mvn clean install
mvn spring-boot:run
```

### 4. API Testing

Use Postman or cURL to test endpoints:

POST /api/v1/auth-service/register

POST /api/v1/auth-service/authenticate

### 📂 Folder Structure

```
src/
├── config/
├── controller/
├── dto/
├── entity/
├── repository/
├── security/
├── service/
└── util/
```

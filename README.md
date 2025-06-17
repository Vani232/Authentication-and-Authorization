                                                                          Authentication and Authorization System

This project implements a basic User Authentication and Authorization system using Spring Boot, JWT (JSON Web Token), and Spring Security. 
It provides secure access to APIs based on user roles such as `USER` and `ADMIN`.

 Features

- 🔐 User Registration
- 🔑 User Login with JWT token generation
- 🧾 Role-based access control (e.g., Admin/User)
- 🛡️ Token validation and secured endpoints
- 📦 REST API using Spring Boot
- 📍 API Gateway and Eureka Server integration (if part of microservices)

🧰 Technologies Used

- Java 17+
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken)
- Maven
- MySQL or H2 (for storing user credentials)
- Postman (for testing)
- Git & GitHub

📦 Project Structure

├── src/
│ ├── main/
│ │ ├── java/com/example/auth/
│ │ │ ├── controller/ # REST endpoints
│ │ │ ├── config/ # Security & JWT configuration
│ │ │ ├── model/ # User & Role entities
│ │ │ ├── service/ # Business logic
│ │ │ └── repository/ # JPA Repositories
│ └── resources/
│ └── application.properties

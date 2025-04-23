# 🍽️ Food Delivery Management System – Microservices Architecture

The **Food Delivery Management System** is a modular, scalable platform built using a microservices architecture in Java Spring Boot. It streamlines food ordering, preparation, delivery, and payment processes for restaurants and customers. Each microservice is independently deployable, focusing on a specific business function, making the system robust, maintainable, and efficient.

---

## 🧩 Microservices Overview

The platform is composed of the following core microservices:

| Microservice            | Description                                      | Port  | Base URL                        |
|-------------------------|--------------------------------------------------|-------|---------------------------------|
| **User Service**        | Handles user login, registration, and profiles   | 8080  | `http://localhost:8080/user`    |
| **Menu Service**        | Manages menu items and their details             | 8081  | `http://localhost:8081/menu`    |
| **Order Service**       | Manages orders including creation and tracking   | 8082  | `http://localhost:8082/order`   |
| **Payment Service**     | Handles payments and refunds                     | 8083  | `http://localhost:8083/payment` |
| **UI Service** *(Optional)* | Provides a frontend interface                 | 2025  | `http://localhost:2025`         |

---

## ⚙️ Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Security (for user authentication)
- RESTful API Architecture
- Swagger/OpenAPI for documentation
- Maven for build automation
- MySQL or H2 (configurable) for persistent storage
- Postman for API testing
- (Optional) React.js for frontend UI

---

## 🔐 Authentication & Authorization

The **User Service** implements secure login and registration features. Authentication tokens (e.g., JWT) can be used to authorize access across services.

---

## 🧪 Testing

- ✅ Unit and integration tests for each microservice using JUnit and Mockito  
- ✅ Manual API testing using Postman collections  
- ✅ Simulated end-to-end workflows for full process validation  

---

## 📄 API Documentation

All microservices are documented with **Swagger UI**.

Example:
- User Service: `http://localhost:8080/swagger-ui.html`
- Order Service: `http://localhost:8082/swagger-ui.html`

Each endpoint includes:
- Request & response formats
- HTTP method
- Sample payloads

---

## 🗃️ Databases Used

- **User Database**: Stores user credentials and profiles  
- **Menu Database**: Stores food items and details  
- **Order Database**: Stores order records  
- **Payment Database**: Stores transaction and refund data

Each service connects to its own isolated database for better modularity and scalability.

---

## 📁 Project Structure

Each microservice is organized independently with the following structure:


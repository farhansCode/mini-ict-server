# Mini ICT Server Environment (Spring Boot + PostgreSQL + Docker)

## Overview

This project is a containerised ICT-style backend system designed to simulate a small-scale enterprise service environment.

It demonstrates how a typical ICT infrastructure supports application services, databases, and monitoring in a multi-service architecture using Docker.

The system includes a REST API built with Spring Boot, integrated with a PostgreSQL database, and deployed using Docker Compose.

---

## Architecture

The system consists of three main components:

- **Spring Boot Application (API Server)**
  - Handles HTTP requests
  - Processes business logic
  - Exposes REST endpoints

- **PostgreSQL Database (Data Layer)**
  - Stores application data persistently
  - Managed via Spring Data JPA

- **Docker Compose (Infrastructure Layer)**
  - Orchestrates multi-container deployment
  - Enables service-to-service networking

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Docker Compose
- Maven


---

## How to Run the Project

### 1. Build and start all services

Run the following commands starting in the server directory:

```bash
mvn clean package
cd ..
docker compose up --build
````

## API Endpoints

All endpoints are accessible via `http://localhost:8080`.

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/message` | Accepts a `text` parameter and stores the message in PostgreSQL. |
| GET | `/messages` | Retrieves all stored messages and returns them in JSON format. |
| GET | `/health` | Checks that the service is running and responsive. |
| GET | `/test-error` | Intentionally triggers a runtime exception to demonstrate error handling, logging, and system behavior under failure conditions. |

### Example Requests

```bash
# Store a message
curl -X POST http://localhost:8080/message -d "text=Hello world"

# Get all messages
curl http://localhost:8080/messages

# Health check
curl http://localhost:8080/health

# Trigger test error
curl http://localhost:8080/test-error

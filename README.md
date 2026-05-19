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

```bash
docker compose up --build

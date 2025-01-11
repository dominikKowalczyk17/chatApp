# Chat Application

Spring Boot based chat application with secure authentication and real-time messaging capabilities.

## Prerequisites

- Java 17+
- Maven
- Docker
- PostgreSQL
- Keycloak

## Environment Setup

1. Create `.env` file in root directory based on `.env.example`:


env
DB_HOST=localhost
DB_PORT=5432
POSTGRES_DB=defaultdb
POSTGRES_USER=postgres
POSTGRES_PASSWORD=your_password


## Running Locally

1. Start the database:

bash
docker-compose up -d

2. Run the application:

bash
./mvnw spring-boot:run

The application will be available at `http://localhost:8080`

## Features

- User authentication with Keycloak
- Real-time messaging
- User conversations
- Message history


## Configuration

The application uses the following configuration files:

- `application.yml` - Main application configuration
- `application-local.yml` - Local development configuration
- `.env` - Environment variables (not in repository)
- `compose.yaml` - Docker compose configuration

## Database Migrations

Database migrations are handled by Liquibase. Migration files are located in:
src/main/resources/db/changelog/


## Security

The application uses Keycloak for authentication and authorization. Security configuration can be found in `application.yml`:


yaml
spring:
security:
oauth2:
resourceserver:
jwt:
issuer-uri: http://localhost:9080/realms/chatapp



## Contributing

1. Create a feature branch
2. Commit your changes
3. Push to the branch
4. Create a Pull Request

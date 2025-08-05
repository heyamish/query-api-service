# Query API Service

- Query API Service is a Spring Boot based REST API that allows querying Call Detail Records (CDRs) stored in a PostgreSQL database. The API supports filtering records based on a date range, MSISDN, and IMSI through a single POST endpoint.


# Features

- Query CDRs by:
  - Date range
  - MSISDN (optional)
  - IMSI (optional)
- Returns filtered records in JSON format
- Uses PostgreSQL as the database
- Written in Java 17 using Spring Boot
- Fully functional with unit-tested endpoints


# Project Structure

cdr/
├── controller/
├── dto/
├── entity/
├── repository/
├── service/
├── resources/
└── pom.xml


# Setup Instruction

- Clone the repository: git clone https://github.com/your-username/query-api-service.git
cd query-api-service/cdr

- Set up PostgreSQL:
   - Create a database (example: cdr_db)
   - Create the call_detail_records table (sample schema below)

  CREATE TABLE IF NOT EXISTS call_detail_records (
    id SERIAL PRIMARY KEY,
    record_date TIMESTAMP NOT NULL,
    msisdn VARCHAR(20),
    imsi VARCHAR(20)
  );

 - Configure application.properties: In src/main/resources/application.properties, update:

  spring.datasource.url=jdbc:postgresql://localhost:5432/cdr_db
  spring.datasource.username=postgres
  spring.datasource.password=db_password

- Build the project: ./mvnw clean install

- Run the application: ./mvnw spring-boot:run


# Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Maven


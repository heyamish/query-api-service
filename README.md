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

---

# Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Maven

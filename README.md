# Job Portal Backend

A RESTful backend application for managing job listings.  
This project is built using Java, Spring Boot, Spring Data JPA, and MySQL.

## Technologies Used

- Java 25
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA

## Features

- Add a new job
- View all jobs
- View a job by ID
- Update a job
- Delete a job
- Search jobs by keyword
- Filter jobs by location
- Filter jobs by minimum salary
- Filter jobs by job type
- Filter jobs by experience
- Input validation
- Custom 404 error handling
- Validation error handling

## Project Structure

```text
src/main/java/com/rutuja/job_portal_backend

├── controller
│   ├── JobController.java
│   ├── GlobalExceptionHandler.java
│   └── JobNotFoundException.java
│
├── model
│   └── Job.java
│
├── repository
│   └── JobRepository.java
│
└── JobPortalBackendApplication.java

## Author

Rutuja

B.Sc. Computer Science
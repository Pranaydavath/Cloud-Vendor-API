☁️ Cloud Vendor API & Management Dashboard
A full-stack application featuring a robust RESTful API built with Spring Boot for managing cloud vendor information, paired with a clean and responsive user interface created with HTML, JavaScript, and Tailwind CSS.

📂 Project Structure
This repository contains two main components, structured as separate modules:

rest-demo-backend: The core of the application. A Spring Boot project that provides a complete REST API for all CRUD (Create, Read, Update, Delete) operations.

rest-demo-frontend: A lightweight, single-page web application that consumes the backend API, allowing users to interact with the vendor data in a user-friendly dashboard.

✨ Features
Full CRUD Functionality: Create, read, update, and delete cloud vendor records.

RESTful API: Well-defined endpoints for managing vendor resources.

Separation of Concerns: Decoupled backend and frontend for better maintainability and scalability.

Robust Error Handling: The backend provides clear error messages for common issues like duplicate or non-existent records.

Interactive UI: A responsive and modern user interface built with Tailwind CSS.

API Documentation: Integrated OpenAPI (Swagger) documentation for easy API exploration and testing.

🛠️ Technologies Used
Area

Technology

Backend

Java 21, Spring Boot 3.x, Spring Data JPA, Hibernate, MySQL, Maven

Frontend

HTML5, JavaScript (ES6+), Tailwind CSS

API Documentation

SpringDoc (OpenAPI 3)

Database

MySQL

🚀 Getting Started
Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites
Make sure you have the following software installed on your system:

Java Development Kit (JDK): Version 21 or later.

Apache Maven: Version 3.8 or later.

MySQL Server: Version 8.0 or later.

An IDE like IntelliJ IDEA or VS Code is recommended.

1. Backend Setup (rest-demo-backend)
First, set up and run the Spring Boot REST API.

a. Database Configuration:

Open your MySQL client (e.g., MySQL Workbench, DBeaver).

Create a new database schema for the project. The default name used is cloud_vendor.

CREATE DATABASE cloud_vendor;

b. Configure Application Properties:

Navigate to rest-demo-backend/src/main/resources/.

Open the application.properties file.

Update the spring.datasource.username and spring.datasource.password properties with your MySQL credentials.

# Correct Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

c. Build and Run the Application:

Open a terminal and navigate to the rest-demo-backend directory.

Build the project using Maven:

mvn clean install

Run the application:

mvn spring-boot:run

The backend server will start on http://localhost:8081.

2. Frontend Setup (rest-demo-frontend)
The frontend is a simple static application that requires no build process.

Navigate to the rest-demo-frontend directory.

Open the index.html file directly in your favorite web browser (e.g., Google Chrome, Firefox).

You should now see the Cloud Vendor Management dashboard, which will automatically connect to your running backend.

📄 API Endpoints
The backend exposes the following REST endpoints. You can also explore these interactively using the Swagger UI.

Swagger UI URL: http://localhost:8081/swagger-ui.html

Method

Endpoint

Description

GET

/cloudvendor

Retrieves a list of all cloud vendors.

GET

/cloudvendor/{vendorId}

Retrieves a single vendor by its ID.

POST

/cloudvendor

Creates a new cloud vendor.

PUT

/cloudvendor

Updates an existing cloud vendor.

DELETE

/cloudvendor/{vendorId}

Deletes a vendor by its ID.

Example POST Request Body:
{
    "vendorId": "C04",
    "vendorName": "Google Cloud",
    "vendorAddress": "Mountain View, CA",
    "vendorPhoneNumber": "888-999-0000"
}

🤝 Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".

Fork the Project

Create your Feature Branch (git checkout -b feature/AmazingFeature)

Commit your Changes (git commit -m 'Add some AmazingFeature')

Push to the Branch (git push origin feature/AmazingFeature)

Open a Pull Request

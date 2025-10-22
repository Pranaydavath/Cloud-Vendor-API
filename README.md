# ☁️ Cloud Vendor API & Management Dashboard

A full-stack application featuring a robust RESTful API built with Spring Boot for managing cloud vendor information, paired with a clean and responsive user interface created with HTML, JavaScript, and Tailwind CSS.

---

**✨ Live Demo ✨**

Access the deployed application here: **[https://cloud-vendor-api-app.web.app/](https://cloud-vendor-api-app.web.app/)**

* **Frontend hosted on:** Firebase Hosting
* **Backend API hosted on:** Render.com (Free tier - may have initial load delay)
* **Database hosted on:** Amazon RDS (MySQL - Free tier)

---

## 📂 Project Structure

This repository contains two main components, structured as separate modules:

* **`rest-demo-backend`**: The core of the application. A Spring Boot project that provides a complete REST API for all CRUD (Create, Read, Update, Delete) operations. Deployed using Docker.
* **`rest-demo-frontend`**: A lightweight, single-page web application that consumes the backend API, allowing users to interact with the vendor data in a user-friendly dashboard.

---

## ✨ Features

* Full CRUD Functionality: Create, read, update, and delete cloud vendor records.
* RESTful API: Well-defined endpoints for managing vendor resources.
* Separation of Concerns: Decoupled backend and frontend for better maintainability and scalability.
* Robust Error Handling: The backend provides clear error messages for common issues like non-existent records.
* Interactive UI: A responsive and modern user interface built with Tailwind CSS.
* API Documentation: Integrated OpenAPI (Swagger) documentation for easy API exploration and testing.

---

## 🛠️ Technologies Used

| Area                | Technology                                                                                                                                                                                                   |
| :------------------ | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Backend** | Java 21, Spring Boot 3.x, Spring Data JPA, Hibernate, Maven, Lombok |
| **Frontend** | HTML5, JavaScript (ES6+), Tailwind CSS                                                                                                |
| **Database** | MySQL                                                                                                                                                                                                  |
| **API Documentation** | SpringDoc (OpenAPI 3)                                                                                                                                                                                  |
| **Deployment** | Docker, **Render.com** (Backend API Hosting), **Firebase Hosting** (Frontend Hosting), **Amazon RDS** (Database Hosting)                                                                                                                            |

---

## 🚀 Getting Started (Local Development)

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Make sure you have the following software installed on your system:

* Java Development Kit (JDK): Version 21 or later.
* Apache Maven: Version 3.8 or later.
* MySQL Server: Version 8.0 or later (or Docker with a MySQL image).
* An IDE like IntelliJ IDEA or VS Code is recommended.

### 1. Backend Setup (`rest-demo-backend`)

First, set up and run the Spring Boot REST API.

**a. Database Configuration:**

* Open your MySQL client (e.g., MySQL Workbench, DBeaver).
* Create a new database schema: `CREATE DATABASE cloud_vendor;`

**b. Configure Application Properties:**

* Navigate to `rest-demo-backend/src/main/resources/`.
* Open the `application.properties` file.
* Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties with your local MySQL credentials.

    ```properties
    # Example Local Database Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/cloud_vendor?useSSL=false
    spring.datasource.username=your_local_mysql_username
    spring.datasource.password=your_local_mysql_password
    # Ensure dialect is set for Hibernate
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
    ```

**c. Build and Run the Application:**

* Open a terminal and navigate to the `rest-demo-backend` directory.
* Run the application using the Maven wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```
* The backend server will start, typically on `http://localhost:8081`.

### 2. Frontend Setup (`rest-demo-frontend`)

The frontend is a simple static application.

* Navigate to the `rest-demo-frontend` directory.
* Open the `index.html` file directly in your favorite web browser (e.g., Google Chrome, Firefox).

The dashboard should load. Ensure the `API_BASE_URL` in the `<script>` tag within `index.html` is pointing to `http://localhost:8081/cloudvendor` for local testing.

---

## 📄 API Endpoints

The backend exposes REST endpoints under the `/cloudvendor` base path. Explore these interactively using the Swagger UI when running locally.

**Swagger UI URL (Local):** `http://localhost:8081/swagger-ui.html`

| Method   | Endpoint                  | Description                            |
| :------- | :------------------------ | :------------------------------------- |
| `GET`    | `/cloudvendor`            | Retrieves a list of all cloud vendors. |
| `GET`    | `/cloudvendor/{vendorId}` | Retrieves a single vendor by its ID.   |
| `POST`   | `/cloudvendor`            | Creates a new cloud vendor.            |
| `PUT`    | `/cloudvendor`            | Updates an existing cloud vendor.      |
| `DELETE` | `/cloudvendor/{vendorId}` | Deletes a vendor by its ID.            |

**Example POST Request Body:**

```json
{
    "vendorId": "C04",
    "vendorName": "Google Cloud",
    "vendorAddress": "Mountain View, CA",
    "vendorPhoneNumber": "888-999-0000"
}

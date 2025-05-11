# Library Management System

A simple Spring Boot web application for managing a library's books, users, librarians, and publishers. This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Spring MVC, Spring Data JPA, Thymeleaf, and an H2 in-memory database.

## Technologies Used

*   **Java 11+** (or as configured in your `pom.xml`)
*   **Spring Boot** (version specified in `pom.xml`, e.g., 2.6.3)
    *   Spring MVC: For building web applications.
    *   Spring Data JPA: For database interaction.
    *   Spring Boot DevTools: For rapid application development.
*   **Hibernate**: JPA implementation.
*   **H2 Database Engine**: In-memory SQL database.
*   **Thymeleaf**: Server-side Java template engine for HTML views.
*   **Maven**: Dependency management and build tool.

## Prerequisites

*   JDK 11 or higher installed.
*   Apache Maven installed.
*   An IDE such as IntelliJ IDEA or Eclipse (optional, but recommended).

## Setup and Running the Application

1.  **Clone the repository (if applicable)**
    ```bash
    git clone <repository-url>
    cd Library
    ```

2.  **Build the project using Maven**
    Open a terminal or command prompt in the project's root directory (`C:\Users\MAHITO\Documents\Library\Library`) and run:
    ```bash
    mvn clean install
    ```

3.  **Run the Spring Boot application**
    You can run the application in several ways:
    *   **From your IDE**: Locate the `LibraryApplication.java` file (usually in `src/main/java/com/example/library/`) and run it as a Java application.
    *   **Using Maven**:
        ```bash
        mvn spring-boot:run
        ```
    *   **Running the JAR file (after building)**:
        ```bash
        java -jar target/library-0.0.1-SNAPSHOT.jar 
        ```
        (The JAR file name might vary based on your `pom.xml` configuration).

4.  **Access the application**
    Once the application is running, open your web browser and navigate to:
    [http://localhost:8080/books](http://localhost:8080/books)

    You should see the book listing page.

## Database Setup

*   The application uses an **H2 in-memory database**. The database is created and initialized each time the application starts.
*   Database connection properties are configured in `src/main/resources/application.properties`.
*   Initial data for publishers, librarians, users, and books is loaded from `src/main/resources/data.sql`. This script is executed on startup due to the `spring.sql.init.mode=always` and `spring.jpa.defer-datasource-initialization=true` properties.
*   You can access the H2 console (if enabled in `application.properties` via `spring.h2.console.enabled=true`) at [http://localhost:8080/h2-console](http://localhost:8080/h2-console).
    *   JDBC URL: `jdbc:h2:mem:laraveldb` (or as configured)
    *   User Name: `sa`
    *   Password: (leave blank)

## Project Structure

*   `src/main/java`: Contains the Java source code.
    *   `com.example.library.controller`: Spring MVC controllers.
    *   `com.example.library.entity`: JPA entity classes.
    *   `com.example.library.repository`: Spring Data JPA repositories.
    *   `com.example.library.service`: Service layer interfaces and implementations.
    *   `LibraryApplication.java`: Main Spring Boot application class.
*   `src/main/resources`: Contains application resources.
    *   `application.properties`: Configuration file.
    *   `data.sql`: Initial database schema and data.
    *   `static`: Static web resources (CSS, JavaScript, images - currently not extensively used).
    *   `templates`: Thymeleaf HTML templates.
        *   `books/`: Templates for book CRUD operations.
*   `src/test/java`: Contains test classes.
*   `pom.xml`: Maven project configuration file.
*   `.gitignore`: Specifies intentionally untracked files that Git should ignore.

## Implemented Features (Book CRUD)

The application currently provides full CRUD functionality for **Books**:

*   **List Books**: View all books with details like author, price, status, librarian, and borrower. Includes a search by book name.
*   **Add New Book**: A form to add a new book, including selecting its librarian and an optional borrower.
*   **View Book Details**: A page showing all details of a single book.
*   **Edit Book**: Modify the details of an existing book.
*   **Delete Book**: Remove a book from the system.

## Future Enhancements

*   Implement full CRUD interfaces for `User`, `Librarian`, and `Publisher` entities.
*   Add more robust validation for form inputs.
*   Implement user authentication and authorization.
*   Enhance UI/UX with CSS frameworks like Bootstrap or Tailwind CSS.
*   Add more complex business logic (e.g., book borrowing/returning workflows, fine calculation).
*   Improve error handling and user feedback.
*   Write comprehensive unit and integration tests.

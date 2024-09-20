# Student Management System

A simple Student Management System built using **Spring Boot**, **Thymeleaf**, and **MySQL**. This system allows users to manage student records, including adding, updating, deleting, and viewing student details.

## Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Database Configuration](#database-configuration)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add new student records
- Update student details
- Delete student records
- View a list of all students
- Server-side form validation

## Tech Stack

- **Backend**: Spring Boot
- **Frontend**: Thymeleaf, HTML, CSS, Bootstrap
- **Database**: MySQL
- **Build Tool**: Maven

## Setup and Installation

### Prerequisites

Make sure you have the following installed:
- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/installer/)

### Steps to Run the Project Locally

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/nikhilsomansahu/Student-Management-System.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd Student-Management-System
   ```

3. **Configure the MySQL Database:**

   Ensure MySQL is running and create a database for the project:
   
   ```sql
   CREATE DATABASE student_management_system;
   ```

4. **Update `application.properties` with Your MySQL Credentials:**

   Open `src/main/resources/application.properties` and update the following lines with your MySQL username and password:
   
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_management_system
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

5. **Build and Run the Project:**

   Use Maven to build and run the project:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

6. **Access the Application:**

   Open your browser and go to:
   ```
   http://localhost:8080/
   ```

## Usage

- **Home Page**: View all students.
- **Add Student**: Navigate to `/students/new` to add a new student.
- **Edit Student**: Update student details by clicking the **Edit** button next to a student's name.
- **Delete Student**: Remove a student by clicking the **Delete** button.

## Database Configuration

To connect the application to MySQL, make sure the `application.properties` file is updated with the correct database configurations.

Here is the sample configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management_system
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Screenshots



## Contributing

Feel free to submit issues or pull requests if you'd like to contribute to the project. Make sure to follow the standard GitHub contribution workflow.

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---


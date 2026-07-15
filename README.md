# JDBC Learning

A Java project that demonstrates the fundamentals of **JDBC (Java Database Connectivity)**, including database connection, CRUD operations, and the use of `PreparedStatement` with MySQL.

## 📌 Features

* JDBC Connection with MySQL
* Create, Read, Update, and Delete (CRUD) operations
* PreparedStatement implementation
* Execute SQL queries
* Secure parameterized queries
* Exception handling
* Proper resource management

## 🛠️ Technologies Used

* Java
* JDBC
* MySQL
* Eclipse / IntelliJ IDEA

## 📂 Project Structure

```text
JDBCLearning/
│── JDBCConnection/
│── CRUDinJDBC/
│── PreparedStatementInJDBC/
│── README.md
```

## 🚀 Prerequisites

* JDK 8 or above
* MySQL Server
* MySQL JDBC Driver
* Eclipse or IntelliJ IDEA

## ⚙️ Database Setup

Create a database:

```sql
CREATE DATABASE jdbc_db;
```

Create a table:

```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);
```

Update the database credentials in your Java program:

```java
String url = "jdbc:mysql://localhost:3306/jdbc_db";
String username = "root";
String password = "your_password";
```

## ▶️ How to Run

1. Clone the repository.
2. Import the project into your IDE.
3. Add the MySQL JDBC Driver.
4. Update the database credentials.
5. Run the desired Java program.

## 📖 Modules

### 1. JDBC Connection

* Establish a connection to the MySQL database.
* Understand the JDBC architecture.
* Execute basic SQL queries.

### 2. CRUD in JDBC

* Insert records into the database.
* Read records from the database.
* Update existing records.
* Delete records from the database.

### 3. PreparedStatement in JDBC

* Use parameterized SQL queries.
* Perform CRUD operations securely.
* Prevent SQL Injection attacks.
* Improve query performance with reusable statements.

## 🎯 Learning Outcomes

* Understand JDBC architecture.
* Connect Java applications to MySQL.
* Perform CRUD operations.
* Use `PreparedStatement` for secure database access.
* Handle SQL exceptions and manage database resources effectively.

## 👨‍💻 Author

**Dhanush N**

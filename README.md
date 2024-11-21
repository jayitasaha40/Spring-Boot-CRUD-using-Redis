# **Spring Boot CRUD Application Using Redis**

This project demonstrates a simple **CRUD (Create, Read, Update, Delete)** application built with **Spring Boot** and integrated with **Redis** as the database. It serves as a practice project to understand how to implement Redis in a Spring Boot application.

---

##  **Features**

- **CRUD Operations**: Perform basic create, read, update, and delete operations.
- **Redis Integration**: Uses Redis as the in-memory database for high performance.
- **RESTful APIs**: Exposes APIs to interact with the application.
- **Lightweight & Fast**: Leverages Redis for quick data retrieval and manipulation.

---

## 🛠️ **Tech Stack**

- **Programming Language**: Java  
- **Framework**: Spring Boot  
- **Database**: Redis  
- **Build Tool**: Maven  

---

## 🏗 **How It Works**

1. **Create**: Add data to Redis via REST API.  
2. **Read**: Fetch data from Redis.  
3. **Update**: Update existing data in Redis.  
4. **Delete**: Remove data from Redis.

---

##  **Getting Started**

### **Prerequisites**

- Java 17+  
- Redis installed and running locally or on a server.  
- Maven installed.  

### **Setup Steps**

1. **Clone the repository**:
   ```bash
   git clone https://github.com/jayi40/Spring-Boot-CRUD-using-Redis.git
   cd Spring-Boot-CRUD-using-Redis

2. **Install dependencies**:
   ```bash
   mvn clean install

3. Configure application.yml: Update Redis configurations such as host and port if necessary.
4. Run the application:
   ```bash
   mvn spring-boot:run
5. Access the APIs:
 Use tools like Postman or cURL to interact with the endpoints.


## **Future Enhancements**
- Add validation and error handling for APIs.
- Implement a front-end to interact with the APIs.
- Explore advanced Redis features like Pub/Sub and data persistence.


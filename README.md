# Inditex Test

## Overview
This repository contains a test project for Inditex. The project is developed using Java 17 with Spring Boot, applying Domain-Driven Design (DDD) principles and hexagonal architecture. It adheres to SOLID, KISS, and Clean Code principles.

## Design and Architecture Decisions
### Domain-Driven Design (DDD) and Hexagonal Architecture
The project follows DDD principles by structuring code around business domains, separating concerns, and maintaining a clear boundary between the domain layer and infrastructure. Hexagonal architecture further enforces this separation, allowing for the independence of the domain model from external frameworks and libraries.

### Justification for Spring Boot
Spring Boot was chosen for its simplicity, productivity, and robust ecosystem. It provides out-of-the-box solutions for common tasks, such as dependency injection, auto-configuration, and embedded server setup, which accelerate development and simplify maintenance.

### Use of Output Port in Service

The choice to use an output port in your service offers several technical and architectural advantages within the context of a hexagonal architecture with Spring.

1. **Separation of Concerns**: By employing an output port, you separate business logic from database access. This follows the single responsibility principle and facilitates code maintenance and evolution by reducing interdependence between components.

2. **Abstraction of Persistence Layer**: The output port acts as an abstraction of the persistence layer, allowing the service to interact with the database in a decoupled manner. This makes it easier to modify the persistence implementation without affecting the service logic, increasing system flexibility and scalability.

3. **Facilitates Unit Testing**: Using an output port enables you to write unit tests for the service without depending on the specific persistence layer implementation. This is achieved by creating a mock of the output port during testing, allowing you to test the service behavior in an isolated and controlled manner.

4. **Improves Code Readability and Maintainability**: The separation of concerns facilitated by the use of an output port makes the code more readable and maintainable. Developers can easily understand what the service does without needing to know the details of the persistence layer implementation.

In summary, using an output port in your service following a hexagonal architecture with Spring promotes modularity, flexibility, and scalability of the system while enhancing code readability and maintainability.

### Justification for Individual Input Parameters
To justify why individual input parameters were chosen over using a Data Transfer Object (DTO), several reasons can be mentioned:

1. **Simplicity and Clarity**: Individual parameters make the method signature in the controller clearer and easier to understand. Developers using your API can immediately see what data is needed to make the query without examining the structure of a DTO object.

2. **Flexibility in Invocation**: By permitting parameters to be conveyed directly within the URL as query parameters, the API offers enhanced flexibility to consumers in invoking the endpoint. This method allows consumers to effortlessly construct the URL with the requisite parameters, obviating the necessity of creating a distinct JSON object. The utilization of the HTTP GET method aligns with the principle of leveraging URLs for resource identification and retrieval, making it suitable for this scenario.

3. **Compatibility with Protocols and Tools**: Some tools and protocols may have limitations or difficulties in handling complex JSON objects in HTTP requests. Using individual parameters avoids potential compatibility issues and makes your API easier to consume for a wide range of clients. Additionally, the GET method is inherently well-suited for simple, idempotent retrieval operations, aligning seamlessly with the nature of parameterized queries.

4. **Reduction of Overhead**: By using individual parameters, you avoid the need to define and maintain additional DTO classes, reducing development overhead and simplifying code maintenance.

### Use of GlobalExceptionHandler
The decision to incorporate a GlobalExceptionHandler within the project stems from several key considerations aimed at enhancing robustness, maintainability, and user experience:

1. **Unified Error Handling**: By employing a GlobalExceptionHandler, all unhandled exceptions across the application can be centrally intercepted and processed. This facilitates the implementation of consistent error handling logic, ensuring uniformity in error responses presented to clients.

2. **Improved Error Reporting**: The GlobalExceptionHandler enables the customization of error responses based on the nature of exceptions encountered. This capability allows for the provision of informative and user-friendly error messages, enhancing the clarity and transparency of error communication with API consumers.

3. **Prevention of Information Leakage**: Through the GlobalExceptionHandler, sensitive or internal error details can be effectively masked or sanitized before being exposed to external clients. This safeguards against inadvertent data exposure and helps uphold security and privacy standards.

4. **Simplified Error Recovery**: The centralized nature of the GlobalExceptionHandler simplifies the implementation of error recovery strategies, such as retry mechanisms or fallback mechanisms. This promotes resilience and fault tolerance within the application, contributing to its overall reliability.

5. **Enhanced Maintainability**: By consolidating error handling logic within a dedicated component, the GlobalExceptionHandler facilitates easier maintenance and evolution of error handling strategies. Modifications or enhancements to error handling behavior can be implemented in a centralized manner, reducing code duplication and enhancing codebase maintainability.

In summary, the adoption of a GlobalExceptionHandler aligns with best practices in software development, offering benefits in terms of error management, user experience, security, and maintainability. Its inclusion reflects a proactive approach to error handling and underscores a commitment to delivering a robust and user-friendly application.

### Use of Swagger for API Documentation
Swagger was chosen as the tool for documenting the API due to several key advantages:

1. **Automated Documentation**: Swagger automatically generates interactive documentation for the API based on annotations in the source code. This eliminates the need for manual documentation and ensures that the documentation stays up-to-date with the codebase.

2. **Easy to Use**: Swagger provides a user-friendly interface that allows developers and API consumers to explore and interact with the API documentation effortlessly. This enhances the overall developer experience and reduces the learning curve for using the API.

3. **API Testing and Debugging**: The interactive nature of Swagger documentation enables developers to test API endpoints directly from the documentation page. This simplifies the process of API testing and debugging, streamlining development workflows.

4. **Standardized Documentation Format**: Swagger follows the OpenAPI Specification, a widely adopted standard for describing RESTful APIs. By adhering to this standard, Swagger ensures consistency and interoperability in API documentation across different platforms and tools.

5. **Integration with Development Workflow**: Swagger integrates seamlessly with development tools and frameworks, including Spring Boot. This makes it easy to incorporate API documentation generation into the development workflow, ensuring that documentation is always kept in sync with the code changes.

In conclusion, the use of Swagger for API documentation offers numerous benefits, including automated documentation generation, ease of use, API testing capabilities, standardized documentation format, and seamless integration with development workflows.

You can visualize the Swagger interface by starting the server and accessing http://localhost:8080/swagger-ui/index.html.

### Adherence to SOLID, KISS, and Clean Code Principles
The implementation follows SOLID principles to ensure maintainability, scalability, and testability. KISS (Keep It Simple, Stupid) and Clean Code principles are applied to promote readability, maintainability, and ease of understanding.

## Technologies and Tools Used
### Java 17
Java 17 was chosen as the programming language for its modern features, performance improvements, and long-term support. It offers enhanced security, efficiency, and developer productivity.

### H2 Embedded Database
H2 was selected as the embedded database for its lightweight nature, ease of setup, and compatibility with Spring Boot. It simplifies testing by providing an in-memory database that mimics the behavior of a full-fledged database system.

### Javadoc Documentation
Javadoc was utilized to document the project, providing comprehensive documentation for the Java source code. This documentation follows the Javadoc format, including descriptions of classes, methods, parameters, return values, and exceptions. By incorporating Javadoc comments directly into the source code, developers can generate HTML documentation using tools like Javadoc or IDE integrations, facilitating better understanding and maintenance of the codebase.

## Configuration and Execution Instructions
### Setup Instructions
1. Clone this repository using the command:
   ```
   git clone https://github.com/josemariapafo/zara.git
   ```
2. Switch to the desired branch using:
   ```
   git checkout develop
   ```
3. Configure your development environment:
    - Set Java 17 as the JDK version.
    - Install necessary dependencies using your preferred build tool (e.g., Gradle or Maven).

### Running the Application
1. Navigate to the project directory.
2. Build the project using:
   ```
   ./gradlew build
   ```
3. Run the application with:
   ```
   ./gradlew bootRun
   ```

## Justification of Technical Decisions
### Use of NUMERIC Data Type
The `NUMERIC` data type was chosen over `FLOAT` for the `PRICE` field in the database to ensure precision and accuracy in financial calculations. `NUMERIC` provides fixed-point arithmetic, avoiding the rounding errors inherent in floating-point arithmetic.

### Query Performance Optimization
To optimize query performance, an index named `idx_product_id` was created on the `productId` field in the `PRICES` table. This index speeds up searches based on `productId`, enabling faster retrieval of relevant records.

### Inclusion of 'curr' Attribute in DTO
The curr attribute was added to the DTO to provide information about the currency associated with the price data. Including this attribute ensures that consumers of the DTO have access to the currency information along with the price, enhancing the completeness and usefulness of the data provided by the DTO.

### Query Strategy for Handling Multiple Results
The rationale behind the choice of this query lies in the scenario where the search may yield multiple results in the database. Given that the application must return only one final price, even when multiple matching tariffs exist for a specific product and chain within a given date range, it was decided to sort the query results in descending order based on the tariffs' priority and then limit the output to a single result using LIMIT 1.

This strategy ensures that the selected final price is from the tariff with the highest priority, avoiding the need for more complex disambiguation logic. Furthermore, it provides consistency in the service response by ensuring that only one final price is always returned, even in cases of multiple matching tariffs.

## Testing
### Integration Tests
Integration tests cover critical aspects of the project, including endpoint functionality, data persistence, and error handling. These tests ensure the reliability and correctness of the application under various scenarios.

# products-api

This project is a simple Spring Boot REST API built for learning and demonstration. It exposes a few example endpoints that return plain text responses and demonstrates how a basic web application is structured in a Maven + Spring Boot project.

## What this project does

The application starts a Spring Boot server and exposes endpoints for:

- `/hello` — returns a greeting message
- `/status` — returns the current date and confirms the API is running
- `/goodbye` — returns a farewell message with the current date and time

These endpoints are defined in `HelloController.java`, which is a Spring MVC controller annotated with `@RestController`. The application uses Spring Boot's auto-configuration to serve these HTTP routes without manually setting up a web server.

## File architecture

The project follows the standard Spring Boot structure:

- `pom.xml`
  The Maven build file. It defines the project metadata, Spring Boot parent, Java version, dependencies, and build plugins.

- `.mvn/wrapper/maven-wrapper.properties`
  Contains the Maven wrapper configuration so the project can be built consistently using a specific Maven version.

- `src/main/java/uk/ac/westminster/products_api/ProductsApiApplication.java`
  The main application class. It starts the Spring Boot application using `SpringApplication.run(...)` and is annotated with `@SpringBootApplication`.

- `src/main/java/uk/ac/westminster/products_api/HelloController.java`
  The controller class that defines the HTTP endpoints. This is the core of the API logic for the demo routes.

- `src/main/resources/application.properties`
  Stores application configuration such as the Spring application name.

- `src/test/java/uk/ac/westminster/products_api/ProductsApiApplicationTests.java`
  A basic Spring Boot test that verifies the application context loads successfully.

- `README.md`
  Project documentation explaining the purpose and architecture.

## How the code works

### 1. Application startup
`ProductsApiApplication` is the entry point:

```java
@SpringBootApplication
public class ProductsApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductsApiApplication.class, args);
    }
}
```

This annotation tells Spring Boot to scan the project for components, configure the application, and start the embedded web server.

### 2. REST controller
`HelloController` handles requests:

```java
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from spring boot !!!!";
    }
}
```

Spring maps the `@GetMapping` methods to HTTP GET requests. Each method returns a `String`, which is sent back to the client as a plain text response.

### 3. Response behavior
The endpoints return a mix of fixed text and dynamic runtime values:

- `/hello` → static greeting
- `/status` → current date using `LocalDate.now()`
- `/goodbye` → farewell plus current date/time using `LocalDateTime.now()`

This is a simple example of how Java and Spring Boot can be used to build and test REST APIs.

## Example endpoints

Once the app is running, you can call:

- `http://localhost:8080/hello`
- `http://localhost:8080/status`
- `http://localhost:8080/goodbye`

## Technology stack

- Java
- Spring Boot
- Maven
- Spring Web MVC
- Springdoc OpenAPI (included in the project dependencies)

## Summary

This repository is a beginner-friendly Spring Boot application that demonstrates:

- project setup with Maven and Spring Boot
- basic REST API endpoint creation
- application startup and configuration
- testing with Spring Boot test support

It is a simple example project intended to introduce web service development in Java.

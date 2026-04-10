# BDCC ENSET - Spring MVC Product Management

A Spring Boot MVC web application for product management with Spring Security authentication and role-based access control.

## Technologies

- **Java 17**
- **Spring Boot 4.0.5**
- **Spring MVC**
- **Spring Security**
- **Spring Data JPA**
- **Thymeleaf** + Thymeleaf Security Extras
- **Bootstrap 4.6.2**
- **H2 Database** (in-memory)
- **Lombok**

## Features

- ✅ Product list (view, add, delete)
- ✅ Role-based access control (USER / ADMIN)
- ✅ Custom login page with Spring Security
- ✅ Logout
- ✅ Not Authorized page
- ✅ Form validation (`@Valid`, `BindingResult`)
- ✅ Bootstrap responsive navbar with authenticated username

## Project Structure

```
src/main/java/ma/enset/bdccensetspringmvc/
├── config/
│   └── SecurityConfig.java       # Spring Security configuration
├── entities/
│   └── Product.java              # Product JPA entity
├── repository/
│   └── ProductRepository.java    # JPA Repository
└── web/
    ├── LoginController.java      # Login page controller
    └── ProductController.java    # Product CRUD controller

src/main/resources/
├── templates/
│   ├── layout1.html              # Shared layout (navbar + content)
│   ├── products.html             # Product list page
│   ├── new-product.html          # Add product form
│   ├── login.html                # Custom login page
│   └── notAuthorized.html        # Access denied page
└── application.properties
```

## Security & Roles

| Route | Role Required |
|---|---|
| `/user/**` | USER |
| `/admin/**` | ADMIN |
| `/login` | Public |

### Default Users

| Username | Password | Role |
|---|---|---|
| `user1` | `1234` | USER |
| `user2` | `1234` | USER |
| `admin` | `1234` | USER + ADMIN |

## Getting Started

### Prerequisites
- Java 17+
- Maven

### Run the application

```bash
mvn spring-boot:run
```

Access the app at: [http://localhost:8094](http://localhost:8094)

### H2 Console

Access the H2 database console at: [http://localhost:8094/h2-console](http://localhost:8094/h2-console)

```
JDBC URL : jdbc:h2:mem:products-db
Username : sa
Password : (empty)
```

## Screenshots

### Login Page
- Custom authentication form with Bootstrap card

### Products Page
- List of all products
- **ADMIN only**: Add new product button + Delete button

### New Product Form
- Form with validation for Name, Price and Quantity

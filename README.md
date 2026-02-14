# Item Management REST API

Simple Java Spring Boot backend application that provides RESTful APIs
to manage a collection of items using in-memory storage.

---

## Technologies Used
- Java
- Spring Boot
- Maven

---

## How to Run the Project

1. Clone the repository
2. Navigate into project folder
3. Run the command:

mvn spring-boot:run

Server will start at:
http://localhost:8080

---

## API Endpoints

### Add Item
POST /api/items

Request Body:
{
  "name": "Laptop",
  "description": "Gaming laptop"
}

Response:
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}

---

### Get Item By ID
GET /api/items/{id}

Example:
GET /api/items/1

Response:
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}

---

## Notes
- Uses in-memory ArrayList as data store
- Input validation using annotations
- No database required

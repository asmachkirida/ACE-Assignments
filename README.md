# Bank Account Management API

A RESTful API for managing bank accounts using **Spring Boot** and **JAX-RS**.

## Features

- Perform CRUD operations for bank accounts
- Supports both JSON and XML formats

## Endpoints

```plaintext
GET    /banque/comptes         // Retrieve all accounts
GET    /banque/comptes/{id}    // Retrieve account by ID
POST   /banque/comptes         // Create a new account
PUT    /banque/comptes/{id}    // Update account by ID
DELETE /banque/comptes/{id}    // Delete account by ID
```

## Demo

A quick demonstration of the API:


```bash
curl -X GET "http://localhost:8080/banque/comptes" -H "Accept: application/xml"
```

## Acknowledgments

Thanks to the contributors on Stack Overflow for their help with troubleshooting errors, particularly regarding the **MessageBodyWriter** error. You can find the relevant discussion [here](https://stackoverflow.com/questions/66680573/severe-messagebodywriter-not-found-for-media-type-application-xml).

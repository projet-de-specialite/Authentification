# Authentication

    This project is a Spring Boot application designed for authentication. It is based on the Spring Boot framework, Spring Security, and JWT, which      facilitates the development of standalone Java applications.

## Features

    - User Registration
    - Login

## Prerequisites

    Before you begin, make sure you have the following properly installed on your system:

      - Java Development Kit (JDK) 8 or above
      - Maven

## Installation

    Follow these steps to install and run the project on your local machine:

        1. Clone this repository to your machine: 
          - git clone https://github.com/projet-de-specialite/Authentification.git
        2. Navigate to the project directory:
          - cd projet-de-specialite/authentification
        3. Build the application using Maven:
          - mvn clean install
        4. Start the application:
          -mvn spring-boot:run

    The application will now be accessible at [http://localhost:8080].


## Authentication

    The application uses an authentication system to secure access to the features. Here is the authentication information:

        - Authentication Type: JWT (JSON Web Token)
        - Signup Endpoint: http://localhost:8080/api/auth/signup
        - Login Endpoint: http://localhost:8080/api/auth/signin

    To access the secure features, you will need to authenticate using the appropriate credentials.


## Users

    - Admin : username: admin/ mot de passe: admin
    - User : username: luc/ mot de passe: luc

## API on swagger

![api](https://github.com/projet-de-specialite/Authentification/assets/79235023/7588bfea-5cf6-41bb-beaf-e8673b867a22)

## API Endpoint for User Registration
    - Method: POST

    - URL: http://localhost:8080/api/auth/signup
    
    - Request Body:
                {
                  "username": "string",
                  "email": "string",
                  "role": ["string"],
                  "password": "string"
                }
          
     - Description: 
          This API is used for user registration. The client needs to send a POST request to the specified URL with the user details in the request body.       The request body should include the username, email, role (as an array of strings), and password of the user. 
          
     - Response:
          Status: 200 OK
          Content-Type: application/json
          Body:
                {
                  "message": "User registered successfully"
                }

 ## API Endpoint for User Login
    - Method: POST

    - URL: http://localhost:8080/api/auth/signin
    
    - Request Body:
                {
                  "username": "string",
                  "password": "string"
                }
          
     - Description: 
          This API is used for user login. The client should send a POST request to the provided URL with the user's username and password in the request body. If the credentials are valid, the API will authenticate the user and generate a session token or provide access to protected resources.
          
     - Response:
          Status: 200 OK
          Content-Type: application/json
          Body:
                {
                  "accessToken": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
                  "tokenType": "Bearer"
                }
     
   ## API Endpoint for Retrieving Users
   
    - Method: GET

    - URL: http://localhost:8080/api/auth/users
    
    - Request Body:
                {
                  "username": "string",
                  "password": "string"
                }
          
     - Description: 
          This API is used to retrieve a list of users. Send a GET request to the specified URL to fetch information about all the users in the system.

     - Response:
          Status: 200 OK
          Content-Type: application/json
          Body:
                {
                  "users": [
                    {
                      "id": 1,
                      "username": "user1",
                      "email": "user1@example.com",
                      "role": ["role1"],
                      "createdAt": "2023-05-18T10:00:00Z"
                    },
                    {
                      "id": 2,
                      "username": "user2",
                      "email": "user2@example.com",
                      "role": ["role2", "role3"],
                      "createdAt": "2023-05-18T11:30:00Z"
                    }
                  ]
                }

 ## API Endpoint for Deleting a User by ID
 
    - Method: DELETE

    - URL: http://localhost:8080/api/auth/users/{id}
          
     - Parameters: 
          id (path parameter): The unique identifier of the user to be deleted.
        
     - Description: 
          This API is used to delete a user based on their ID. Send a DELETE request to the provided URL, replacing {id} with the actual user                     ID. This will remove the user from the system permanently.

     - Response:
          Status: 204 No Content
     
          
              
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          

ToDo APP BACKEND

Getting Started: 
To get a local copy up and running follow these simple steps.

Installation - 
Clone the repo:
git clone https://github.com/Arathypr/Backend_ToDoList.git

Build the project : 
mvn clean install

User Endpoints  :-

POST /postUser :

Description: Create a new user.

Request Body: User object.

Response: Returns a success message indicating the user has been created.

GET /getUser

Description: Retrieve a user by username and password.

Request Parameters:

userName: Username of the user.

password: Password of the user.

Response: Returns an optional containing the user if found.

Project Endpoints

POST /postProject

Description: Create a new project for a specific user.

Request Parameters:

Username: Username of the user.

Request Body: Title of the project.

Response: Returns a success message indicating the project has been created.

GET /getProjectById

Description: Retrieve a project by its ID.

Request Parameters:

projectId: ID of the project.

Response: Returns an optional containing the project if found.

GET /getProjectList

Description: Retrieve a list of projects for a specific user.

Request Parameters:

Username: Username of the user.

Response: Returns a list of projects associated with the user.

PUT /updateProject

Description: Update the title of a project.

Request Parameters:

projectId: ID of the project to update.

Request Body: New title of the project.

Response: Returns a success message indicating the project has been updated.

DELETE /deleteProjectList

Description: Delete a project.

Request Parameters:

projectId: ID of the project to delete.

Response: Returns a success message indicating the project has been deleted.

Todo Endpoints

POST /postTodo

Description: Create a new todo for a specific project.

Request Parameters: 

projectId: ID of the project to which the todo belongs.

Request Body: List containing todo details.

Response: Returns a success message indicating the todo has been created.

GET /getToDotById

Description: Retrieve a todo by its ID.

Request Parameters:

todoId: ID of the todo.

Response: Returns an optional containing the todo if found.

GET /getToDoList

Description: Retrieve a list of todos for a specific project.

Request Parameters:

projectId: ID of the project.

Response: Returns a list of todos associated with the project.

PUT /updateToDo

Description: Update the details of a todo.

Request Parameters:

todoId: ID of the todo to update.

Request Body: List containing updated todo details.

Response: Returns a success message indicating the todo has been updated.

DELETE /deleteToDoList

Description: Delete a todo.

Request Parameters:

todoId: ID of the todo to delete.

Response: Returns a success message indicating the todo has been deleted.


DEPENDECIES :

spring-boot-starter-data-jdbc: Starter for using JDBC with Spring Data.

spring-boot-starter-data-jpa: Starter for using Spring Data JPA with Hibernate.


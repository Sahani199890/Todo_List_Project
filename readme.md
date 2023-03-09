# Todo Project
### Requirements
* IntelliJIDEA
* ServerPort: 8080 (use: localhost:8080)
* Java version: 17
* Everything is present in the pom.xml (no need to download any library)
### Steps to run Todo Project
* Download the source code and import in intellijIDEA.
* Go to localhost:8080/
* Put end-points accordingly to perform different operations such as create todo task,fetch particular todo, fetch todo list,update todo and delete todo
## End-points
### Add todo in the list
* api/v1/todo-app/add-todo
### Find particular todo with I'd 
* api/v1/todo-app/find-todo/id/{id}
### Fetch all todos from the list
* api/v1/todo-app/find-all
### Update specific todo from the list
* api/v1/todo-app/update-todo/id/{id}
### Delete todo from the todo list 
* api/v1/todo-app/delete-todo/id/{id}
# Dependencies 
## Validation 
* Bean Validation with Hibernate validator.
## H2 Database
* Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
## Spring Web
* Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
## Spring Boot DevTools
* Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
## Spring Data JPA
* Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
## Lombok
* Java annotation library which helps to reduce boilerplate code.

# Working
* Everyone has some todo list to perform with in the time period accordingly the todo time period can be given for different todos 1 day todo,1 week todo,1 month todo and 1 year todo so on
* This project has ability to add todo and create todo and delete todo and update todo and watch all the todo as per requirement by giving various endpoints we can perform all the operations
* Swagger is added in the project, so we can perform these operations in fancy way through Html page on site directly without even having the idea of programming skills we can perform all the operations easily
* Swagger makes ease to access and modify the changes as per todo they wanted
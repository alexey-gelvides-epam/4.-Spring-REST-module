# Spring REST module

## Topics: 

- REST API Architecture overview
- Richardson Maturity Model
- HTTP headers and response codes
- REST API design best practice
- Documenting
- Validation of REST API using Swagger
- Common design challenges

## Task description

1.  Download Java SE Development Kit 8 according to your OS and processor’s architecture.

2. Install Java Development Kit according to JDK installation instructions (see also PATH and CLASSPATH).

3. Download Apache Maven 3.6.0 according to your OS and processor’s architecture.

4. Install Apache Maven according to installation instructions.

5. Create maven project with 4 modules:
    - event-service-api;
    - event-service-dto; 
    - event-service-impl; 
    - event-service-rest.
6. event-service-dto module should contain Event class with following fields:
    - id;
    - title;
    - place;
    - speaker;
    - eventType;
    - dateTime.
7. event-service-api module should contain EventService interface with following methods:
    - createEvent(…);
    - updateEvent(…);
    - getEvent(…); * deleteEvent();
    - getAllEvents();
    - getAllEventsByTitle(…).
8. event-service-impl module should contain EventServiceImpl which implements EventService interface and responds with list of Events.
    - Note: feel free to use any database (filesystem, any db, in memory storage).
9. event-service-rest module should contain EventServiceController which provides REST API interface according to 2nd or 3rd level of REST API maturity and responds with list of Events.

10. Document methods in EventServiceController using Swagger 2 annotations.

11. Implement Application class with @SpringBootApplication annotation and main method.

12. Create runnable Spring Boot JAR with dependencies using spring-boot-maven-plugin.

13. Run event-service jar using SpringBoot and Analyse REST API with Swagger UI.

14. Provide sample requests to EventService, demonstrate it’s work using Swagger UI.

Note: implement REST APIs according to all Richardson Maturity Level as additional task.

## Studying materials

- REST API Architecture - https://learn.epam.com/detailsPage?id=fb972d7e-e805-40df-a082-d97066e2d422
- Spring RESTful API - https://spring.io/guides/gs/rest-service/
- Spring Boot - https://learn.epam.com/detailsPage?id=4e0a5e98-9b9e-46a1-97be-1a4d2186ca33
- Swagger - https://learn.epam.com/detailsPage?id=6f44aa2f-b8af-49ce-bb54-56d476bb9781

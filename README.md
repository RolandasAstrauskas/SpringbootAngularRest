# SpringbootAngularRest
Project using Springboot, Angular, Rest for search from H2

Dependency - JPA, H, Springboot web, Logging, Log4j2, Springboot devtools, Assertj core, Junit.

Backended
-------------------
Controller - use @RestController, @CrossOrigin. Find client by ID or birthday and return list of cleints.
Repository - @Repository. extends JPA.
Item - @Entity. Client object - client ID, client name and lastname, male and birthday.
Service - @Service. Three methods find by id, find by birthday and find all. Save log in aplication.log file.
GeneratedExample database - load database with example.

Frontend
-----------------
Angular with component - table, button for search id and button for search birthday.

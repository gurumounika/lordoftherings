<h1>The Lord of The Rings API</h1>
<h4>Technologies that are used to build this API - </h4>
•	Maven<br/>
•	Spring Boot<br/>
•	Java Persistence API<br/>
•	MYSQL Workbench<br/>
•	Tomcat Server<br/>
•	Postman<br/>
•	IntelliJ IDE<br/><br/>

Spring Boot is used to create mapping for the end point URL of the API. <br/>

Java Persistence API is used to integrate between the backend MYSQL database and the endpoint. <br/>

Added the JPA and MYSQL dependencies in maven POM.xml file.<br/>

Created Movie and Quote models to store the data in the tables in MYSQL database schema –               
“ lotrmovie”. <br/>

Created MovieRepo and QuoteRepo interfaces to access the JpaRepository.<br/>

Developed ApiControllers class to provide all the Rest Controller GET AND POST mappings .<br/>

Used Postman API to save the data into the database by creating a POST request and passing the column data in the JSON format. <br/>

Used Apache Tomcat server to do build and deploy the changes in the server.<br/>

Developed the endpoint API’s using the IntelliJ IDE .<br/><br/>

Endpoint URL’S:<br/>
http://localhost:8080/movie<br/>
http://localhost:8080/movie/1<br/>
http://localhost:8080/quote<br/>
http://localhost:8080/quote/1<br/>


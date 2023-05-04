# lordoftherings
<h1>This repository contains The Lord of The Rings movies and quotes JSON data.</h1><br/>
Technologies that are used to build this API -<br/></br>
•	Maven<br/>
•	Spring Boot<br/>
•	Java Persistence API<br/>
•	MYSQL Workbench<br/>
•	Tomcat Server<br/>
•	Postman<br/>
•	IntelliJ IDE<br/><br/>

Follow below steps to consume this API:<br/></br>
•	Install MYSQL Workbench and set up the root password. Create the schema - "lotrmovie" <br/>
•	Update the password and in Application. Properties file<br/>
•	Access postman with the endpoint URLs to save the data in MYSQL database to Movie and Quote tables.<br/>

POST REQUEST<br/>
http://localhost:8080/savemovie<br/>
Sample JSON data<br/>
{<br/>
 "movieName":"The Two Towers"<br/>
}<br/>

http://localhost:8080/savequote<br/>
Sample JSON data<br/>
{<br/>
"quote":"There is only one Lord of the Ring, only one who can bend it to his will. And he does not share power.<br/>
}<br/>

•	Once data is saved, the below endpoint URLs can be accessed from the browser.<br/>

http://localhost:8080/movie<br/>
http://localhost:8080/movie/1<br/>
http://localhost:8080/quote<br/>
http://localhost:8080/quote/1<br/>

POSTMAN Collection<br/>

https://api.postman.com/collections/12917490-2d19f281-17c1-4365-b0b6-384dbd565921?access_key=PMAT-01GZJBRY8M7T26CGACPFQF3BT5















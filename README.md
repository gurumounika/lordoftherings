# lordoftherings
This repository contains The Lord of The Rings movies and quotes JSON data.
Technologies that are used to build this API -
•	Maven
•	Spring Boot
•	Java Persistence API
•	MYSQL Workbench
•	Tomcat Server
•	Postman
•	IntelliJ IDE

Follow below steps to consume this API:
•	Install MYSQL Workbench and set up the root password.
•	Update the password in Application. Properties file
•	Access postman with the endpoint URLs to save the data in MYSQL database to Movie and Quote tables.

POST REQUEST
http://localhost:8080/savemovie
Sample JSON data
{
 "movieName":"The Two Towers"
}

http://localhost:8080/savequote
Sample JSON data
{
"quote":"There is only one Lord of the Ring, only one who can bend it to his will. And he does not share power.
}

•	Once data is saved, the below endpoint URLs can be accessed from the browser.

http://localhost:8080/movie
http://localhost:8080/movie/1
http://localhost:8080/quote
http://localhost:8080/quote/1

POSTMAN Collection

https://api.postman.com/collections/12917490-2d19f281-17c1-4365-b0b6-384dbd565921?access_key=PMAT-01GZJBRY8M7T26CGACPFQF3BT5















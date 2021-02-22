<p class="has-line-data" data-line-start="0" data-line-end="3"><a href="http://Readme.md">Readme.md</a><br>
Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial<br>
Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql and JPA .</p>
<p class="has-line-data" data-line-start="4" data-line-end="6">Requirements<br>
Java - 1.8.x</p>
<p class="has-line-data" data-line-start="7" data-line-end="8">Maven - 3.x.x</p>
<p class="has-line-data" data-line-start="9" data-line-end="10">Mysql - 5.x.x</p>
<p class="has-line-data" data-line-start="11" data-line-end="12">Steps to Setup</p>
<ol>
<li class="has-line-data" data-line-start="12" data-line-end="14">Clone the application</li>
</ol>
<p class="has-line-data" data-line-start="14" data-line-end="15">git clone <a href="https://github.com/Pushpraj777/spring-boot-mysql-rest-api.git">https://github.com/Pushpraj777/spring-boot-mysql-rest-api.git</a></p>
<ol start="2">
<li class="has-line-data" data-line-start="15" data-line-end="17">Create Mysql database</li>
</ol>
<p class="has-line-data" data-line-start="17" data-line-end="18">create database mydb</p>
<ol start="3">
<li class="has-line-data" data-line-start="18" data-line-end="20">Change mysql username and password as per your installation</li>
</ol>
<p class="has-line-data" data-line-start="20" data-line-end="21">open src/main/resources/application.properties</p>
<p class="has-line-data" data-line-start="22" data-line-end="23">change spring.datasource.username and spring.datasource.password as per your mysql installation</p>
<ol start="4">
<li class="has-line-data" data-line-start="24" data-line-end="26">Build and run the app using maven</li>
</ol>
<p class="has-line-data" data-line-start="26" data-line-end="29">mvn package<br>
java -jar target/easy-notes-1.0.0.jar<br>
Alternatively, you can run the app without packaging it using -</p>
<p class="has-line-data" data-line-start="30" data-line-end="32">mvn spring-boot:run<br>
The app will start running at <a href="http://localhost:8080">http://localhost:8080</a>.</p>
<p class="has-line-data" data-line-start="33" data-line-end="35">Explore Rest APIs<br>
The app defines following CRUD APIs.</p>
<p class="has-line-data" data-line-start="36" data-line-end="37">GET /api/mydb</p>
<p class="has-line-data" data-line-start="38" data-line-end="39">POST /api/mydb</p>
<p class="has-line-data" data-line-start="40" data-line-end="41">GET /api/mydb/{Id}</p>
<p class="has-line-data" data-line-start="42" data-line-end="43">PUT /api/mydb/{Id}</p>
<p class="has-line-data" data-line-start="44" data-line-end="46">DELETE /api/mydb/{Id}<br>
You can test them using postman or any other rest client.</p>

# 1

**Create a new maven project**
Use the .pom file to import JDBC MySQL driver

https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-installing-maven.html

# 2

**Create a connection to your local MySQL instance**<br>

Create database with *emp_dept.sql*

Connect, create statement, execute & print all values from 1 column.

Challenge: Print all rows & columns use resultset.getMetaData()

# 3

*Refactor* your code by adding a:
**DatabaseConnectionManager class**<br>

Move all connection related attributes to that class<br>

Enable the class to: <br>
Return a working connection object through a method: getConnection

# 4

Create 2 classes: Employee & Department<br>
Employee has all the attributes of the columns in emp<br>
Department has all the attributes of the columns in dept<br>

Employee has a method: getAllEmployees <br>
The method returns a **map** with empno as *key* & the related Person object as *value*<br>

**Challenge** *Print the map sorted by hiredate*

Department has a method: getSetOfDepartments <br>
The method returns a **set** containing all department objects

# 5

**Create an application.property file**

Configure your DatabaseConnectionManager such that the database connectivity attributes are gathered from your property file
 <br>
 (instead of hard-coded in your DatabaseConnection attributes)<br>


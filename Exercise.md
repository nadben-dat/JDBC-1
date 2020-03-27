# 1

**Download JDBC driver: https://dev.mysql.com/downloads/connector/j/** (Platform independent) <br>
Add as dependency to project: https://www.jetbrains.com/help/idea/working-with-module-dependencies.html

# 2

**Create a connection to your local MySQL instance**<br>

Create database with *emp_dept.sql*

Connect, create statement, execute & print all values from 1 column.

# 3

Refactor your code and add a:
**DatabaseConnectionManager class**<br>
Move all connection related attributes to that class<br>
Enable the class to: <br>
Return a working connection object through a method: getConnection

# 4

Create 2 classes: Employee & Department<br>
Employee has all the attributes of the columns in emp<br>
Department has all the attributes of the columns in dept<br>

Employee has a method: getAllEmployeesById <br>
The method returns a **map** with empno as *key* the related Person object as *value*<br>

Department has a method: getSetOfDepartments <br>
The method returns a **set** containing all department objects

# 5

**Create a db.property file**

Configure your DatabaseConnectionManager such that the variables are gathered from your 
property file <br>(instead of hard-coded in your DatabaseConnection attributes)<br>
In git: Ignore the .properties file
Upload your project to a git repo

Share your github repository with a person in class<br>
Confirm that the java code can access each others databases with only changes in .properties

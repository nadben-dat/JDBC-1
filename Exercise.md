**1**

**Download JDBC driver: https://dev.mysql.com/downloads/connector/j/** (Platform independent) <br>
Add as dependency to project: https://www.jetbrains.com/help/idea/working-with-module-dependencies.html

**2**

**Create a connection to your local MySQL instance**<br>

Create database with <i>emp_dept.sql</i>

Print all columns & row values from the table emp in Java<br>
Join emp & dept -> Print deptno + ename + empno in Java<br>
Create 2 classes Employee & Department<br>
Create 1 lists with all employee objects<br>
Create 1 list with all department objects<br>

**3**

Refactor your code and add a:
**DatabaseConnectionManager class**<br>
Move all connection related information and functionality to that class<br>
Create a method in the class that:<br>
Returns a connection object 
<br>(such that other classes can easily connect to your database using this returned object).

**4**

**Create a db.property file**

Configure your DatabaseConnectionManager such that the variables are gathered from your 
property file (instead of hard-coded in your code)<br>
In git: Ignore the .properties file
Upload your project to a git repo

Share your github repository with a person in class<br>
Confirm that the java code can access each others databases with only changes in .properties

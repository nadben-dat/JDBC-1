1

**Download JDBC driver: https://dev.mysql.com/downloads/connector/j/**
(Platform independent)

2

**Create a connection to your local MySQL instance**

Print all rows from the table emp
Join emp & dept -> Print departmentNr + ename + empno in Java

3

**Create a DatabaseConnectionManager class**

All database connection variables must be contained here
Create a method that:
Returns a connection object (such that other classes can easily connect to your database).

4

**Create a db.property file**

Configure your DatabaseConnectionManager such that the variables are gathered from your 
property file (instead of hard-coded in your code)
In git: Ignore the .properties file
Upload your project to a git repo

Share your github repository with a person in class
Confirm that the java code can access each others databases with only changes in .properties

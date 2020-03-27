1

**Download JDBC driver: https://dev.mysql.com/downloads/connector/j/** (Platform independent) <br>
Add as dependency to project: https://www.jetbrains.com/help/idea/working-with-module-dependencies.html

2

**Create a connection to your local MySQL instance**

Print all rows from the table emp<br>
Join emp & dept -> Print departmentNr + ename + empno in Java

3

Refactor your code and add a:
**DatabaseConnectionManager class**<br>
All database connection related info must be contained here<br>
Create a method in the class that:
Returns a connection object (such that other classes can easily connect to your database using this returned object).

4

**Create a db.property file**

Configure your DatabaseConnectionManager such that the variables are gathered from your 
property file (instead of hard-coded in your code)<br><br>
In git: Ignore the .properties file
Upload your project to a git repo

Share your github repository with a person in class<br>
Confirm that the java code can access each others databases with only changes in .properties

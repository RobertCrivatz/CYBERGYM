# CYBERGYM: Web Application for Gym Products

## Technologies Used

### Front-End Development:
- HTML
- CSS
- JavaScript
- Bootstrap

### Back-End Development:
- Java (JDK 8+)
- JDBC
- Servlet
- JSP

### Database:
- MySQL

## Dummy Database Initialization
1. Open MySQL Command Prompt or MySQL Workbench.
2. Login to the administrator user of MySQL: `mysql -u <username> -p` (Enter Password if asked).
3. Copy-paste and execute the MySQL Query from the following file: `databases/mysql_query.sql`.

## Importing and Running the Project Through Eclipse EE
1. Open Eclipse Enterprise Edition. (Install if not already installed).
2. Import the project from Git.
3. Navigate to `Java Resources > src > application.properties` and update the values as follows:
   - Update value for `db.username` and `db.password` according to your installed MySQL credentials.
   - Update value for `mailer.email` and `mailer.password` with the same email and app password generated earlier. (Note: Actual Gmail password will not work).

4. Right-click on the project > Run as > Maven Build > In the goals field, enter "clean install" > Apply > Run.
5. Right-click on the project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if Red Mark Exists > Finish.
6. Right-click on the project > Maven > Update Project > Select Force Update > Apply > Close.

7. **Tomcat Configurations**:
    - If Tomcat Server is not configured in Eclipse:
        - Right-click on the project > Run As > Run On Server > Manually Define a new server > Select server type > select Tomcat v8.0+ > (Select Tomcat V8.0+ Installation Location If Asked) > Next > Add the current project > Finish.

    - Else If Tomcat Server is already configured in Eclipse:
        - Right-click on the project > Run As > Run On Server > Select Tomcat Version > Next > Add the project > Finish.
        
        *or*
        
        - Go to the server tab, select the Tomcat server, and use the debug or run button to start the previously ran project.

8. Check the running site at [http://localhost:8080/shopping-cart/](http://localhost:8080/shopping-cart/).

9. **To Change the Port (if getting error like 'port already in use')**:
    - Open The Server Tab > Double Click On Tomcat Server > Ports > Change The Port Number For Http/1.1 To 8083 > Close And Save. Now Start, and you can access the project on [http://localhost:8083/shopping-cart/](http://localhost:8083/shopping-cart/).

10. Default Username And Password For Admin Is "admin@gmail.com" And "admin".

11. The default Username And Password For User Is "guest@gmail.com" And "guest".

These instructions should guide you through setting up and running the CYBERGYM web application smoothly.

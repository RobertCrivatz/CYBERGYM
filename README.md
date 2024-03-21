# CYBERGYM
Webapp for Gym products

Technologies used:-

    Front-End Development:

    HTML
    CSS
    Javascript
    BootStrap

    Back-End Development:

    Java [JDK 8+]
    JDBC
    Servlet
    JSP

    Database:

    MySql
================= Dummy Database Initialization =================

STEP 1: Open MySQL Command Prompt or MySQL Workbench

STEP 2: Login to the administrator user of MySql: mysql -u <username> -p (Enter Password if asked)

STEP 3: Copy paste and execute the MySQL Query from the following file:-

    Run the Sql Query From this file: databases/mysql_query.sql
========== Importing and Running The Project Through Eclipse EE ==========

Step 1: Open Eclipse Enterprise Edition. [Install, if not already installed.]

Step 2: Click On File > Import > Git > Projects From Git > Clone Uri > Paste The Repository Url as: https://github.com/shashirajraja/shopping-cart.git> Select master Branch > Next > Next > Finish.

Step 3: Go inside Java Resources > src > application.properties and update the values as below:

    a) Update value for db.username and db.password according to your installed mysql credentials.
    b) Update value for mailer.email and mailer.password, with the same email and app password that you generated earlier in above section [ NOTE:Actual gmail password will not work]

Step 4: Right Click on Project > Run as > Maven Build > In the goals field enter "clean install" > apply > run

Step 5: Right Click On Project > Build Path > Configure Build Path > Libraries > Remove and Update Any Libraries if Red Mark Exists > Finish.

Step 6: Right Click on Project > maven > update project > select force update > apply > close

Step 7: Tomcat Configurations:

    If Tomcat Server is not configured in Eclipse :
        Right Click On Project > Run As > Run On Server > Manually Define a new server > Select server type > select Tomcat v8.0+ > (Select Tomcat V8.0+ Installation Location If Asked) > Next > Add the current project > Finish.

    Else If Tomcat Server is already configured in Eclipse:
        Right Click On Project > Run As > Run On Server > Select Tomcat Version > Next > Add the project > Finish.

        or
        You can directly goto server tab, select the tomcat server and use the debug or run button to start the previously ran project

Step 8: Check Running The Site At http://localhost:8080/shopping-cart/

Step 9: [To Change the Port, if getting error like 'port already in use'] Open The Server Tab > Double Click On Tomcat Server > Ports > Change The Port Number For Http/1.1 To 8083 > Close And Save. Now Start and you can access the project on http://localhost:8083/shopping-cart/

Step 10: Default Username And Password For Admin Is "admin@gmail.com" And "admin"

Step 11: The default Username And Password For User Is "guest@gmail.com" And "guest"

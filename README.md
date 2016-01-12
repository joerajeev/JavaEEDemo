# JavaEEDemo
Playground for JavaEE stuff

Will demonstrate sample EJB's and JPA implementations. 

Authors
-------
* "Joseph Rajeev Motha" <joerajeev@gmail.com>

 Setup
 ------
* The sql required to create the DB is in resources/create_db.sql. It was created with MySQL workbench and may need tweaking to work with other DB's.
* The app excepts a Datasource in your JEE appication server with the name 'jdbc/carsales'. (Locally I run this on Glassfish)
For example:

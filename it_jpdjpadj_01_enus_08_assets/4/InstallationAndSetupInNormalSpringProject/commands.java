# At this point we have shown installations of MySQL, SQL Workbench on both Mac as well 
# as Windows machine

Set up Maven Project
--------------------

=> Create a folder /Users/loonycorn/projects/skillsoft/

# Go to the terminal

=> create maven project using below command

mvn archetype:generate -DgroupId=com.skillsoft.springdatajpa  \
                       -DartifactId=spring-data-jpa-app \
                       -DarchetypeArtifactId=maven-archetype-quickstart  \
                       -DinteractiveMode=false

=> Once build is successful 


=> Now we have to import this project into IntelliJ.
=> Open IntelliJ and go to File-> open -> SpringDataJpaApplication
=> Specify the root directory where pom.xml file is.

# Delete the "test" folder present within the "src" folder

# and go to pom file and add the following dependency
# spring-core, spring-context, spring-data-jpa, 
# hibernate-core, mysql-connector-java, hibernate-entitymanager 

#-----------------------------------------------------------------------------------------

=> This section describes the basics of configuring Spring Data JPA through either:

configuring Spring Data JPA through - Java configuration
---------------------------------------------------------

### Create a package

### If the com.skillsoft.springdatajpa package does not exist:
### Inside the src/main/java folder, right-click and create a new Package
### Call it com.skillsoft.springdatajpa


### Inside the com.skillsoft.springdatajpa package 
## define an entity bean class called Employee; refer Employee.java 

# Configure Entity Manager Factory and Transaction Manager using java configuration

### Inside the com.skillsoft.springdatajpa package
# create the configuration file" refer - JpaConfig.java 

### Inside the com.skillsoft.springdatajpa package
# create interface "EmployeeRepository"  extends "CrudRepository" refer - EmployeeRepository.java

# CRUD Operations using Annotation Based Configuration
# Create the java context using AnnotationConfigApplicationContext in main class -refer App-1.java
# Run the programme and go to my sql and check it out.

### Head over to your Database client (e.g. MySQL Workbench)
### Refresh the schemas menu on the left if needed and ensure 
### the Company DB has been created

use Company;

select * from Employee;

### The employees are created with ids 1-4

## Clear out the contents of the employee table
truncate Employee;

## Confirm the table is empty
select * from Employee;

#-----------------------------------------------------------------------------------------

configuring Spring Data JPA through - XML configuration
--------------------------------------------------------

# Configure Entity Manager Factory and Transaction Manager using xml file
 # same entity bean and EmployeeRepository files refer Employee.java ,EmployeeRepository.java

# go to main create directory name - resources inside the folder 
# create the xml file "applicationContext.xml" refer - applicationContext.xml

### In App.java, add the following import
import org.springframework.context.support.ClassPathXmlApplicationContext;

### Change the main method to look like this
  public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        App s = (App) ctx.getBean("mainBean");

        s.addEmployees();
        ctx.close();
    }

### Refer to App-2.java for the full source
# Run the program

### Head over to your Database client (e.g. MySQL Workbench)

### Check whether the employees have been added

SELECT * from employee;

# the data has been added to the table
### Notice that the ids are now 5-8 rather than 1-4 in the first run


// Navigate to https://start.spring.io/ to create a spring project

// Provide the below details 

Group :        com.skillsoft
Artifact :     springDataJpa
Name :         springdatajpa
Description :  Demo project for Spring Data JPA
Packaging :    Jar
Java :         16

Click on the button "Add Dependencies"  add the below 2 dependencies

1. Spring Data JPA
2. MySQL Driver

// Click on "Generate". The project will be created in a zip file.

// Unzip the file and place the directory within the path, say "/Users/loonycorn/projects/skillsoft/"

// Open the "springdatajpa" project in Intellij

// Delete the "test" folder present within the "src" folder

// Open up the pom.xml and view the all dependencies

//-----------------------------------------------------------------------------------------

// Two ways to do the data source configuration.
// 1. As bean in a Java class with @Configuration annotation
// 2.Spring Boot properties file to define data source properties

1. As a bean in a Java class with @Configuration annotation
---------------------------------------------------------

// Java-based data source configuration in a Spring Boot
// Create the new file "JpaAppConfiguration.java". configure class using "@Configuration"Annotation
// refer to JpaAppConfiguration.java

import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaAppConfiguration {

}

// Configuring the Datasource Bean

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("loonycorn");
        dataSource.setUrl("jdbc:mysql://localhost:3306/CompanyDB?createDatabaseIfNotExist=true&useSSL=false");

        return dataSource;
    }

// Configuring the Entity Manager Factory Bean

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.skillsoft.springdatajpa");
        factory.setDataSource(dataSource());
        return factory;
    }

// Configuring the transactionManager

import javax.persistence.EntityManagerFactory;
import org.springframework.orm.jpa.JpaTransactionManager;

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);

        return transactionManager;
    }

// Configuring Spring Data JPA by annotating the "EmployeeConfiguration class with 
// the "@EnableJpaRepositories" annotation.

// Configure the base packages that are scanned when Spring Data JPA creates implementations 
// for our repository interfaces.

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.skillsoft.springdatajpa"})
public class EmployeeConfiguration {

}

// Define an Entity
//// Inside the com.skillsoft.springdatajpa package, create a sub-package called model
//// Inside this com.skillsoft.springdatajpa.model package,
//// create the new class "Employee.java" - refer Employee.java


//// Create a new sub-package called repository inside com.skillsoft.springdatajpa
// create a repository interface for the above Employee entity named as EmployeeRepository.java ,
// refer - EmployeeRepository.java

package com.skillsoft.springDataJPA;

public interface EmployeeRepository {
}

// Extending the CrudRepository Interface


import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

//// There should already be a class called SpringdatajpaApplication.java
// If not, create an Application Class - refer SpringdatajpaApplication.java


  @Bean
  public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
    return (args) -> {

      // Create Employees
      employeeRepository.save(new Employee("Renee Bauer", "renee_bauer70@hotmail.com"));
      employeeRepository.save(new Employee("Raj Chawanda", "raj_chawanda@hotmail.com"));
      employeeRepository.save(new Employee("Neil Parks", "neil_parks82@hotmail.com"));
      employeeRepository.save(new Employee("Marcia Lin", "Marcia_Lin89@hotmail.com"));

    };
  }

// Run the programme and Go to my sql workbench and refresh the schema
// we will se the companyDB is created expand that the table employee also present.
// we will check the data insert or not using the following query

USE CompanyDB ;

SELECT * FROM CompanyDB.Employee;

// Then delete the table using the query

DROP TABLE CompanyDB.Employee;

//-----------------------------------------------------------------------------------------

2.Spring Boot properties file to define data source properties
---------------------------------------------------------------

// Delete the class file "JpaAppConfiguration.java"

// Add the below details within the "src/main/resources/application.properties" file

// MySQL connection properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=password123
spring.datasource.url=jdbc:mysql://localhost:3306/CompanyDB?createDatabaseIfNotExist=true&useSSL=false

// Log JPA queries
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

// Drop and create new tables (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto=create

// Hibernate SQL dialect
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect


////// Modify SpringdatajpaApplication.java so that only 2 new employees are added
  @Bean
  public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
    return (args) -> {

      // Create Employees
      employeeRepository.save(new Employee("Ryan Sato", "ryan.sato@loonycorn.com"));
      employeeRepository.save(new Employee("Kyra Weiss", "kweiss.diallonics@gmail.com"));

    };
  }


// Run the program Go and check the DB contents from mySQL Workbench

USE CompanyDB ;

SELECT * FROM Employee;


////// Reintroduce the file JpaAppConfiguration
//////// Modify SpringdatajpaApplication and re-add all the Employees


  @Bean
  public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
    return (args) -> {

      employeeRepository.save(new Employee("Renee Bauer", "renee_bauer70@hotmail.com"));
      employeeRepository.save(new Employee("Raj Chawanda", "raj_chawanda@hotmail.com"));
      employeeRepository.save(new Employee("Neil Parks", "neil_parks82@hotmail.com"));
      employeeRepository.save(new Employee("Marcia Lin", "Marcia_Lin89@hotmail.com"));
      employeeRepository.save(new Employee("Ryan Sato", "ryan.sato@loonycorn.com"));
      employeeRepository.save(new Employee("Kyra Weiss", "kweiss.diallonics@gmail.com"));

    };
  }

// Run the program Go and check the DB contents from mySQL Workbench

USE CompanyDB ;

SELECT * FROM Employee;
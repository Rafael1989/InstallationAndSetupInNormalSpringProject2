package com.skillsoft.SpringDataJpa;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Repository;
//
//import javax.sql.DataSource;
//
//@Configuration("mainBean")
//@EnableJpaRepositories(basePackages = "com.skillsoft.SpringDataJpa")
//@Import(JpaConfig.class)
//public class App
//{
//    @Autowired
//    private EmployeeRepository repository;
//
//    @Autowired
//    private DataSource dataSource;
//
//    public static void main( String[] args )
//    {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(App.class);
//        ctx.refresh();
//
//        App s = (App) ctx.getBean("mainBean");
//
//        s.addEmployees();
//
//        ctx.close();
//    }
//
//    private void addEmployees() {
//
//        Employee emp1 = new Employee("Richard", 32);
//        Employee emp2 = new Employee("Saline", 30);
//        Employee emp3 = new Employee("John", 16);
//        Employee emp4 = new Employee("Rose", 30);
//
//        repository.save(emp1);
//        repository.save(emp2);
//        repository.save(emp3);
//        repository.save(emp4);
//    }
//}
//################################################################################################################

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Configuration
@Repository
public class App
{
    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private DataSource dataSource;

    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        App s = (App) ctx.getBean("mainBean");

        s.addEmployees();
        ctx.close();
    }

    private void addEmployees() {

        Employee emp1 = new Employee("Rachel", 45);
        repository.save(emp1);

    }
}
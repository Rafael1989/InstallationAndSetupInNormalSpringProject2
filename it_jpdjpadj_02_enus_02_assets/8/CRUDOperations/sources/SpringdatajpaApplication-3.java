package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringdatajpaApplication.class, args);
  }

  @Bean
  public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
    return (args) -> {

      System.out.println("\n**************************");
      System.out.println("\nRetrieving all employee data...\n");
      for (Employee em : employeeRepository.findAll()) {
        System.out.println(em.toString());
      }
      System.out.println("\n**************************");

      System.out.println("\n**************************");
      System.out.println("\nRetrieving data for one employee...\n");
      Employee em = employeeRepository.findById(1L).get();
      System.out.println(em.toString());
      System.out.println("\n**************************");

      System.out.println("\n**************************");
      System.out.println("\nRetrieving an employee based on email address...\n");
      Employee employeeByEmail = employeeRepository.findByEmailaddress("Marcia_Lin89@hotmail.com");
      System.out.println(employeeByEmail.toString());
      System.out.println("\n**************************");
    };
  }
}

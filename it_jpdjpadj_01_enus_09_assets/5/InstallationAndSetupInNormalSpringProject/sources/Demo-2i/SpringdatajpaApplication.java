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

      // Create Employees
      employeeRepository.save(new Employee("Renee Bauer", "renee_bauer70@hotmail.com"));
      employeeRepository.save(new Employee("Raj Chawanda", "raj_chawanda@hotmail.com"));
      employeeRepository.save(new Employee("Neil Parks", "neil_parks82@hotmail.com"));
      employeeRepository.save(new Employee("Marcia Lin", "Marcia_Lin89@hotmail.com"));

    };
  }
}

package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringdatajpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringdatajpaApplication.class, args);
  }

  @Bean
  public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
    return (args) -> {

      Optional<Employee> emp = employeeRepository.findByEmail("marcia.lin@loonycorn.com");

      if(emp.isPresent()) {

        Employee retrievedEmp = emp.get();
        retrievedEmp.setEmail("marcia-lin@loonycorn.com");

        employeeRepository.save(retrievedEmp);

        System.out.println("\n**************************");
        System.out.println("\nEmployee updated:");
        System.out.println(retrievedEmp.toString());
        System.out.println("\n**************************");
      }


    };
  }
}

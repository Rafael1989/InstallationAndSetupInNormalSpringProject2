package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
		return (args) -> {

		  employeeRepository.save(new Employee("Marcia Lin", "marcia.lin@loonycorn.com"));

		  System.out.println("\n**************************");
		  System.out.println("\nRetrieving employees based on name...\n");
		  Employee employeeByName = employeeRepository.findByName("Marcia Lin");
		  System.out.println(employeeByName.toString());
		  System.out.println("\n**************************");
		};
	}
}

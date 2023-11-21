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

			System.out.println("\n**************************");
			System.out.println("\nRetrieving employees based on name...\n");
			Optional<List<Employee>> employeesByName = employeeRepository.findByName("Loony Corn");
			System.out.println(employeesByName.toString());
			System.out.println("\n**************************");

			System.out.println("\n**************************");
			System.out.println("\nRetrieving employee based on Id...\n");
			Optional<Employee> employeeById = employeeRepository.findById(25L);
			System.out.println(employeeById.toString());
			System.out.println("\n**************************");

	    };
	  }
}

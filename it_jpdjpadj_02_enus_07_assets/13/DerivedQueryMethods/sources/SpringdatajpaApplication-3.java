package com.skillsoft.springdatajpa;

import com.skillsoft.springdatajpa.model.Employee;
import com.skillsoft.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
		return (args) -> {

			System.out.println("\n**************************");
			System.out.println("\nRetrieving Employees by name AND level:");

			System.out.println("\nName and level match 1 employee");
			List<Employee> empsByNameAndLevel = employeeRepository.findByNameAndLevel("Marcia Lin", 4);
			System.out.println("Returned data: " + empsByNameAndLevel.toString());

			System.out.println("\nName and level match 0 employees");
			empsByNameAndLevel = employeeRepository.findByNameAndLevel("Marcia Lin", 5);
			System.out.println("Returned data: " + empsByNameAndLevel.toString());

			System.out.println("\n**************************");
			System.out.println("\nRetrieving Employees by name");

			System.out.println("\nfindByName");
			List<Employee> empsByName = employeeRepository.findByName("Raj Chawanda");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameIs");
			empsByName = employeeRepository.findByNameIs("Raj Chawanda");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameEquals");
			empsByName = employeeRepository.findByNameEquals("Raj Chawanda");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameIsNot");
			empsByName = employeeRepository.findByNameIsNot("Raj Chawanda");
			System.out.println("Returned data: " + empsByName.toString());

		};
	}
}

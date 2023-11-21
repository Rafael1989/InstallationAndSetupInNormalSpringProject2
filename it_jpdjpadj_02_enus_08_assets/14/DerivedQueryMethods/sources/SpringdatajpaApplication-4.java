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
			System.out.println("\nRetrieving Employees by name");

			System.out.println("\nfindByNameStartsWith");
			List<Employee> empsByName = employeeRepository.findByNameStartsWith("R");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameEndingWith");
			empsByName = employeeRepository.findByNameEndingWith("Lin");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameIgnoreCase");
			empsByName = employeeRepository.findByNameIgnoreCase("reneE baUer");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindByNameLike");
			empsByName = employeeRepository.findByNameLike("%Weis%");
			System.out.println("Returned data: " + empsByName.toString());

			System.out.println("\nfindFirstByName");
			Employee emp = employeeRepository.findFirstByName("Marcia Lin");
			System.out.println("Returned data: " + emp.toString());

			System.out.println("\nfindFirstByNameOrderByLevelAsc");
			emp = employeeRepository.findFirstByNameOrderByLevelAsc("Marcia Lin");
			System.out.println("Returned data: " + emp.toString());


			System.out.println("\n**************************");
			System.out.println("\nRetrieving Employees by email");

			System.out.println("\nfindByEmailContaining");
			List<Employee> empsByEmail = employeeRepository.findByEmailContaining("ar");
			System.out.println("Returned data: " + empsByEmail.toString());

			System.out.println("\nfindFirstByOrderByEmail");
			Employee empByEmail = employeeRepository.findFirstByOrderByEmail();
			System.out.println("Returned data: " + empByEmail.toString());



		};
	}
}

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
			System.out.println("\nRetrieving Employees by name or email:");

			System.out.println("\nBoth name and email match");
			List<Employee> empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks",
																	"neil_parks82@hotmail.com");
			System.out.println("Returned data: " + empsByNameOrEmail.toString());

			System.out.println("\nOnly name matches");
			empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks",
					"neil.parks@loonycorn.com");
			System.out.println("Returned data: " + empsByNameOrEmail.toString());

			System.out.println("\nOnly email matches");
			empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Gardener",
					"neil_parks82@hotmail.com");
			System.out.println("Returned data: " + empsByNameOrEmail.toString());

			System.out.println("\nNeither name nor email match");
			empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Gardener",
					"neil.parks@loonycorn.com");
			System.out.println("Returned data: " + empsByNameOrEmail.toString());

			System.out.println("\nName and Email match different people");
			empsByNameOrEmail = employeeRepository.findByNameOrEmail("Neil Parks",
					"renee_bauer70@hotmail.com");
			System.out.println("Returned data: " + empsByNameOrEmail.toString());

			System.out.println("\n**************************");
		};
	}
}

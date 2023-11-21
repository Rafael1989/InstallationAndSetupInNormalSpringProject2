package com.skillsoft.springDataJPA;

import com.skillsoft.springDataJPA.model.Employee;
import com.skillsoft.springDataJPA.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner EmployeeDemo(EmployeeRepository employeeRepository) {
		return (args) -> {

			// create Employee
			employeeRepository.save(new Employee("John Doe", "john.doe@hotmail.com"));
			employeeRepository.save(new Employee("Emma Watson", "emma.watson@hotmail.com"));
			employeeRepository.save(new Employee("Seno Reta", "seno.reta@hotmail.com"));
			employeeRepository.save(new Employee("Mike Hassan", "mike.hassan@hotmail.com"));

		};
	}
}